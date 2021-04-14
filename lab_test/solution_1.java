/**
 * PROVIDE THE FOLLOWING DETAILS:
 * 
 * ID NUMBER: 
 * 
 * NAME:
 * 
 * ROOM NO:
 * 
 * TERMINAL NO:
 */

/********************** IMPORTANT INSTRUCTIONS **************************
* 1. You are not allowed to import new classes or packages.
* 2. You are not allowed to declare new methods.
* 3. You are not allowed to declare new instance variables.
* 4. You are allowed to declare local variables inside the methods.
* 5. Write your code below the comments against the question numbers.
* 6. Write neat and clean code with proper indentation.
*************************************************************************/

import java.io.*;
import java.util.*;

class SharedData {

	private static int INDEX = 0;
	private static int SIZE;
	private ArrayList<Order> lstSharedOrder = new ArrayList<Order>(); 
	
	public synchronized void put(Order order) {
		lstSharedOrder.add(order);
		SIZE = lstSharedOrder.size();
	}
	
	public Order get() {
		return lstSharedOrder.get(INDEX++);
	}
	
	public static int size(){
		return SIZE;
	}
}

class Order {
	
	private int orderID;
	private double sales;
	private String category;
	
	public Order(String strOrder) {
		String[] parseStringArray = strOrder.split(",");
		this.orderID = Integer.parseInt(parseStringArray[0]);
		this.sales = Double.parseDouble(parseStringArray[1]);
		this.category = parseStringArray[2];
	}

	public int getOrderID() {
		return orderID;
	}

	public double getSales() {
		return sales;
	}

	public String getCategory() {
		return category;
	}	
	
	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", sales=" + sales + ", category=" + category + "]";
	}
}

public class OnlineTestQP1Solution {
	
	public static void main(String[] args) {
	    
		DataProcessor dp = new DataProcessor("F:\\OnlineTestFirstSem2020-21.txt"); 
		SharedData sharedMem = new SharedData();
		Thread[] orderReaderWorker = new Thread[dp.getCategories().size()];
		
		int x = -1;
		for(String category : dp.getCategories()) {
			orderReaderWorker[++x] = new Thread(new OrderReader(category, dp.getArrOrder(), sharedMem));
	    	orderReaderWorker[x].start();	    	
		}   
		
		for(int i=0; i<orderReaderWorker.length; i++) {
	    	try {
				orderReaderWorker[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	    	
		} 		
		
		OrderReader.populateCategoryWiseMap();
		
		Order[] arrOrder = OrderReader.findOrdersWithMaximumSaleUnderEachCategory(dp.getCategories().size());
		for(Order o : arrOrder){
			System.out.println(o);
		}
		
	}
}

/*********************************************************************************
 * This class encapsulates the methods for counting the total number of orders
 * , population of the order array, and finding unique order categories.
 * 
 *  TOTAL MARKS FOR CORRECT IMPLEMENTATION OF THIS CLASS = 07
 *********************************************************************************/
class DataProcessor {
	
	/*** DON'T ADD YOUR OWN STATE VARIABLES ***/
	private File fileHandle; //should be initialized in the constructor of the class 
	private Set<String> categories; //this set should be initialized with unique order categories by invoking findUniqueProductCategories() method
	private Order[] arrOrder = null; //this array should be populated by invoking populateOrderArray() method
	
	/*** DON"T MODIFY THE CONSTRUCTOR CODE ***/
	public DataProcessor(String filename) {
		fileHandle = new File(filename); 
		populateOrderArray();
		findUniqueProductCategories();
	}
	
	/******************* WRITE CODE FOR THIS METHOD ******************************
	 * Q.1 Read the file and return the count of the total orders. 
	 * Use myObj instance of type File for this purpose.
	 * 
	 * Marks = 02 [BINARY MARKING EITHER 02 or 0 MARKS]  
	 *****************************************************************************/
	public int countTotalOrders() {
		int count = 0;
		try {			  
			Scanner myReader = new Scanner(fileHandle);
			while (myReader.hasNextLine()) {
				count++;				  
				myReader.nextLine();
			}
		    myReader.close();
	    } catch (FileNotFoundException e) {
	    	System.out.println("An error occurred.");
	    	e.printStackTrace();
		}
		return count;		
	}
	
	/******************* WRITE CODE FOR THIS METHOD ******************************
	 * Q.2 Read the file attached to fileHandle and populate the field arrOrder 
	 * 
	 * Marks = 02 [BINARY MARKING EITHER 02 or 0 MARKS]  
	 *****************************************************************************/
	private void populateOrderArray() {
		try {
		  int noOfOrders = countTotalOrders();
		  arrOrder = new Order[noOfOrders];
		  Scanner myReader = new Scanner(fileHandle);
		  for(int i=0; i<noOfOrders; i++) {
			  arrOrder[i] = new Order(myReader.nextLine());				  
		  }
		  myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	}
	
	/***************************** WRITE CODE FOR THIS METHOD ******************************
	 * Q.3 Initialize categories field with unique order categories while traversing the 
	 * field arrOrder. Write an optimized code to perform this task i.e., don't try to add
	 * the category which is already present in the set categories.  
	 * 
	 * Marks = 03 [BINARY MARKING EITHER 03 or 0 MARKS]  
	 ***************************************************************************************/
	private void findUniqueProductCategories() {
		  categories = new HashSet<String>();
		  String str = arrOrder[0].getCategory();
		  categories.add(str);
		  for (int i = 1; i <arrOrder.length; i++) {
			  if(categories.contains(arrOrder[i].getCategory())) continue;
			  else categories.add(arrOrder[i].getCategory());
		  }	
	}

	/**
	 * Don't modify the code of this method 
	 */
	public Order[] getArrOrder() {
		return arrOrder;
	}

	/**
	 * Don't modify the code of this method 
	 */
	public Set<String> getCategories() {
		return categories;
	}	
}

/*************************************************************************************
 * The OrderReader is a multi-threaded class which dispatches as many threads as
 * are the number of unique order categories. Each thread is responsible for 
 * counting the number of orders in its own category, populating the category
 * wise order map, and finally populating the list lstSharedOrder which is a
 * member of SharedData class by calling the put() method of the SharedData class.
 * 
 *  TOTAL MARKS FOR CORRECT IMPLEMENTATION OF THIS CLASS = 13
 *************************************************************************************/
class OrderReader implements Runnable {
	
	/*** DON'T ADD YOUR OWN STATE VARIABLES ***/
	private static SharedData SD;	
	private Order[] arrOrder;
	private String myCategory;
	private Order[] ordersInMyCategory;
	private static Map<String, List<Order>> categoryWiseOrderMap;
	
	/*** DON"T MODIFY THE CONSTRUCTOR CODE ***/
	public OrderReader(String category, Order[] arrOrder, SharedData sharedData) {
		this.SD = sharedData;
		this.arrOrder = arrOrder;
		this.myCategory = category;
		this.categoryWiseOrderMap = new HashMap<String, List<Order>>();
	}

	/*** DON"T MODIFY THE CODE OF THE run() METHOD***/
	public void run() {			
		int count = countOrdersInEachCategory();
		ordersInMyCategory = new Order[count]; //initialize array 
		populateMyOrderArray();
		populateSharedData();		
	}
	
	/*************** WRITE CODE FOR THIS METHOD ******************
	 * Q.4 Traverse the field arrOrder and count the total orders 
	 * in each threads own category.
	 * 
	 * [BINARY MARKING EITHER 02 or 0 MARKS] 
	 *************************************************************/
	public int countOrdersInEachCategory(){
		int count = 0;
		for(int i=0; i<arrOrder.length; i++) {
			if(arrOrder[i].getCategory().equals(myCategory)) {
					count++;
			}
		}
		return count;
	}
	
	/*************** WRITE CODE FOR THIS METHOD ******************
	 * Q.5 Traverse the field arrOrder and populate the local 
	 * array ordersInMyCategory in each thread's category
	 * 
	 * [BINARY MARKING EITHER 02 or 0 MARKS] 
	 *************************************************************/
	public void populateMyOrderArray() {
		for(int i=0, j=0; i<arrOrder.length; i++) { 
			if(arrOrder[i].getCategory().equals(myCategory)) { 
				ordersInMyCategory[j++] = arrOrder[i];
			}
		}
	}
	
	/*************** WRITE CODE FOR THIS METHOD ******************
	 * Q.6 Each thread traverses its own array ordersInMyCategory
	 * and populates the lstSharedOrder which is a field in 
	 * SharedData class by invoking the put() method on the  
	 * static variable of the SharedData class. 
	 * 
	 * [BINARY MARKING EITHER 02 or 0 MARKS] 
	 *************************************************************/
	public void populateSharedData() {
		for (int i = 0; i < ordersInMyCategory.length; i++) {
            SD.put(ordersInMyCategory[i]);		           
        }		
	}
	
	/*************** WRITE CODE FOR THIS METHOD *************************
	 * Q.7 This is a static method which populates the category wise 
	 * map i.e., categoryWiseOrderMap which is a HashMap. The HashMap's
	 * key = order category and value is a ArrayList of orders in that 
	 * category.  
	 * 
	 * [BINARY MARKING EITHER 03 or 0 MARKS] 
	 ********************************************************************/
	public static void populateCategoryWiseMap() {
		for(int i=0; i<SharedData.size(); i++) {
			Order od = SD.get();
			String strOrder = od.getCategory();
			if(!categoryWiseOrderMap.containsKey(strOrder)) {
				categoryWiseOrderMap.put(strOrder, new ArrayList<Order>());
				categoryWiseOrderMap.get(strOrder).add(od);
			} else {
				categoryWiseOrderMap.get(strOrder).add(od);
			}			
		}		
	}
	
	/************************** WRITE CODE FOR THIS METHOD ****************************
	 * Q.8 This is a static method which traverses categoryWiseOrderMap to 
	 * find out orders with maximum sale under each category. This method returns
	 * an array of Orders which contains orders with maximum sale under each category
	 * 
	 * [BINARY MARKING EITHER 04 or 0 MARKS] 
	 **********************************************************************************/
	public static Order[] findOrdersWithMaximumSaleUnderEachCategory(int size){
		Order[] arrOrders = new Order[size];
        int i = 0;
		for (String name : categoryWiseOrderMap.keySet()) { 
            List<Order> lstCatWiseOrders = categoryWiseOrderMap.get(name); 
            Collections.sort(lstCatWiseOrders, new Comparator<Order>() {
				public int compare(Order o1, Order o2) {
					if(o1.getSales() < o2.getSales()) return 1;
					else if(o1.getSales() > o2.getSales()) return -1;
					return 0;
				}
			});
            arrOrders[i] = lstCatWiseOrders.get(0);
            i++;
        }
		return arrOrders;
	}	
}


