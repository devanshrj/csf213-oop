package package2;

/* PROVIDE THE FOLLOWING DETAILS:
 * 
 * ID NUMBER: 
 * 
 * NAME:
 */
 

/********************** IMPORTANT INSTRUCTIONS *************************************************
* Before attempting the test, read the IMPORTANT INSTRUCTIONS file in the ZIP folder carefully.
* Execution and output carries 2.5 marks.
* TIP: Attempting the questions in chronological order will ease the implementation.
************************************************************************************************/

import java.io.*;
import java.util.*;

/****************************************************************************************************************************************
 * 											DO NOT MODIFY THE INTERFACE 
 ****************************************************************************************************************************************/

interface Aggregate<T>{
	void add(T e);
	Collection<T> get();
}

class Student{
	int idNo;
	String fName;
	String lName;
	double cgpa;
	
	/****************************************************************************************************************************************
	 * 											DO NOT MODIFY THE DEFINITION OF THIS CLASS 
	 ****************************************************************************************************************************************/
	class ValidationException extends Exception implements Aggregate<Exception>{
		private static final long serialVersionUID = 11111111;
		private List<Exception> exceptionList;
	
		ValidationException(String s){
			super(s);
			exceptionList = new ArrayList<Exception>();
		}

		public void add(Exception e) {
			exceptionList.add(e);
		}

		public Collection<Exception> get() {
			return exceptionList;
		}
	}
	
	Student(String fName, String lName, double cgpa) throws ValidationException {
		ValidationException exp = new ValidationException("");
		
		/********************************************* WRITE CODE BELOW THIS COMMENTED PORTION *******************************************
		 * 
		 * Q.4  Assign the First Name, Last Name, CGPA using the corresponding methods and idNo using the overridden hashCode.
		 * Use the ValidationException instance to collect all possible exceptions arising from these methods.  
		 * Throw the collected exception instance only when its size is non-zero. 
		 * 
		 * For eg. For Record no 1 in the given input file, two exception objects should be collected and thrown from the constructor.
		 * 		  							
		 * [BINARY MARKING: 02 MARKS]
		 *********************************************************************************************************************************/
		try{
			setName(fName,lName);
		}catch(ValidationException ce) {
			exp.add(ce);
		}
		try{
			setCGPA(cgpa);
		}catch(ValidationException ce) {
			exp.add(ce);
		}
		idNo = hashCode();
		if (exp.get().size()>0)
			throw exp;
	}

	void setName(String fName, String lName) throws ValidationException {
		
		/********************************************* WRITE CODE BELOW THIS COMMENTED PORTION *******************************************
		 * 
		 * Q.1 This method assigns the first name and last name. 
		 * If the first or last name contains non-alphabets, then throw the following validation exception 
		                  "First or Last Name must contain characters only".
		 * If the first letter of the first or last name is not capitalized, then throw the following validation exception
  		  		  		  "First or Last Name should start with a capital letter"					
		 
		 [BINARY MARKING: 2.5 MARKS]
		 *********************************************************************************************************************************/
		this.fName = fName;
		this.lName = lName;
		Character ch1 = fName.charAt(0);
		Character ch2 = lName.charAt(0);
		if (!(fName+lName).matches("^[a-zA-Z]*$"))
			throw new ValidationException("First or Last Name must contain characters only");
		else if ((ch1 >= 'a' && ch1 <= 'z')||(ch2 >= 'a' && ch2 <= 'z'))
			throw new ValidationException("First or Last Name should start with a capital letter");			
	}
	
	void setCGPA(double cgpa) throws ValidationException{
		/********************************************* WRITE CODE BELOW THIS COMMENTED PORTION *******************************************
		 * 
		 * Q.2 This method assigns the CGPA. 
		 * If the CGPA is not in the range [0 – 10], the throw the following validation exception 
		  			"CGPA not in range"		
		 
		 [BINARY MARKING: 0.5 MARKS]
		 *********************************************************************************************************************************/
		this.cgpa = cgpa;
		if (cgpa >10 || cgpa <0)
			throw new ValidationException("CGPA not in range");			
	}
	
	public int hashCode() { 
		/********************************************* WRITE CODE BELOW THIS COMMENTED PORTION *******************************************
		 * 
		 * Q.3 Generate a random number between 1 and 100.
		 * To generate the hashCode, add the integer part of the CGPA, hash code of the first name and last name with the random number. 
		   NOTE: Make sure that the hash code is between 1 – 1000.
		
		 [BINARY MARKING: 0.5 MARKS]
		 *********************************************************************************************************************************/
		
		int r = 1 + (int)(Math.random() * 100);
		return 1+(fName.hashCode()+lName.hashCode()+(int)cgpa+r)%1000;
	}
	public String toString() {
		return idNo+" "+(fName+" "+lName)+" "+cgpa;
	}
	
}

public class OnlineTestQP2Solution {
	static HashMap<String,Student> populateMap() {
		Scanner in=null;
		HashMap<String,Student> hm=null;
		
		/********************************************* WRITE CODE BELOW THIS COMMENTED PORTION *******************************************
		 * 
		 * Q.5 Read the input file OnlineTestQP2.txt. First few lines of the file are part of the header and are to be ignored. 
		 * Your code has to ignore all the lines until you find a line with the word "OOP". The line after this contains the 
		 * no. of student records provided in the file, which is followed by the actual student records in the format given below: 
		 							FirstName LastName, DEPT, CGPA 
		 * 
		 * Read the student record and retrieve the individual attributes using the methods in the String class. YOU ARE NOT ALLOWED TO USE
		 * THE STRING TOKENIZER. Create an instance of class student if the validation conditions are satisfied else handle the array list of 
		 * ValidationException thrown by Student constructor. Use lambda expression to print the array list of exceptions for a particular 
		 * student record. And continue reading remaining records from the file.
		 * 
		 * Sample message printed by the exception handler is shown below for your reference.
					Validation fails for Record no 1: First or Last Name should start with a capital letter; CGPA not in range;
					
		 * Key for the Map is determined as follows:
				For the first student record in CSE dept: Kushi Gupta, CSE, 7.6
				Map Key is 2020CSE1000
				Use the Calendar class (to retrieve the current year), dept name and looping index to assign the key.
		 * If the validation is successful, add the Key, and the student object to the Hash Map.

		 * [BINARY MARKING: 5 MARKS]
		 *********************************************************************************************************************************/
		
		try {
			
			hm = new HashMap<String,Student>();
			String fName, lName, dept, st[];
			double cgpa;
			Student s=null;
			int year;
			
			in = new Scanner(new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\CSF213FS2021\\src\\package2\\OnlineTestQP2.txt"));
			String line = in.nextLine();

			while (line != null & !line.contains("OOP")) 
				line = in.nextLine();
			int no = in.nextInt();
			in.nextLine();

			
			for(int i=0;i<no;i++)
			{
				line = in.nextLine();
				st  = line.split(" |, ");
				fName=st[0];
				lName=st[1]; 
				dept = st[2];
				cgpa =Double.parseDouble(st[3]);
				try {
					s = new Student(fName,lName,cgpa);
				}
				catch(Student.ValidationException ce) {
					System.out.print("Validation fails for Record no "+(i+1)+": ");
					ce.get().forEach((ex)->System.out.print(ex.getMessage()+"; "));
					System.out.println();
					continue;
				}
				year = Calendar.getInstance().get(Calendar.YEAR);
				hm.put(year+dept+(i+1000),s); 	
			}
		}
		catch(Exception e) {
			in.close();}
		return hm;
	}
	
	static List<Student> sortByDept(Map<String,Student> hm, String search_dept) {
		List<Student> list = new ArrayList<Student>();
		
		/********************************************* WRITE CODE BELOW THIS COMMENTED PORTION *******************************************
		 * 
		 * Q.6 Search the Map using its key, String search_dept and fetch the Student records of the specified department into an array list.
		 * Create a lambda expression for the Comparator interface of Student type to sort the list. 
		 		The body of the lambda expression concatenates a space in between the first and the last name. 
		  		The list is sorted by arranging the Student CGPA in descending order. 
		  		When two students have the same CGPA, then arrange them in alphabetical order of their names.
		 * Sort the list using this lambda expression and return it.

		 * [BINARY MARKING: 4 MARKS]
		 *********************************************************************************************************************************/
		
		for(Map.Entry<String, Student> e: hm.entrySet())
			if (e.getKey().contains(search_dept))
				list.add(e.getValue());

		Comparator<Student> custom = (Student o1, Student o2)->{
			int i =  Double.compare(o2.cgpa, o1.cgpa);
			if (i != 0) return i;
			return (o1.fName+" "+o1.lName).compareTo(o2.fName+" "+o2.lName) ;	
		};

		Collections.sort(list, custom);
		return list;
	}
	
	static void writeRecords(List<Student> sortedList) {
		
		/********************************************* WRITE CODE BELOW THIS COMMENTED PORTION *******************************************
		 * 
		 * Q.7 Write the sorted list to an output file QP2_Student_ID_number.txt

		 * [BINARY MARKING: 2 MARKS]
		 *********************************************************************************************************************************/
		try {
			PrintWriter fos = new PrintWriter(new FileOutputStream("C:\\Users\\Dell\\eclipse-workspace\\CSF213FS2021\\src\\package2\\output.txt"));
			for (Student s : sortedList)
				fos.println(s);
			fos.close(); 
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		/********************************************************************************
		The Map stores all the valid records from the input file using populateMap().
		**********************************************************************************/

		Map<String,Student> hm = populateMap();
		List<Student> sortedList;
		
		Scanner in = new Scanner(System.in);
		String search_dept;
		
		System.out.println("Enter the dept name [CSE or EEE or Mech]");
		
		/********************************************* WRITE CODE BELOW THIS COMMENTED PORTION *******************************************
		 * 
		 * Q.8 Get the department name from the console. Invoke the sortByDept() method to sort the students of the specific search department 
		 * and store it in a list.
		 * 
		 * Print the elements of the sorted list using a lambda expression. 
		 * Invoke the writeRecords() method to write the sorted list into a file.
		 
		 * [BINARY MARKING: 1 MARK]
		 *********************************************************************************************************************************/
		
		
		search_dept = in.next();
		in.close();
		
		
		sortedList = sortByDept(hm, search_dept); 
		sortedList.forEach((student)->System.out.println(student));

		writeRecords(sortedList);
	}
}
