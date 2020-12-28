package lab1;

// Bicycle class
public class Bicycle {
	
	int speed = 100;
	int noOfGears = 5;
	int cadence = 40;
	
	public void printState() {
		System.out.println("Bicycle [cadence=" + cadence + ", noOfGears=" + noOfGears+ ", speed=" + speed + "]");
	}
	
	public static void main(String[] args) { 
		/*create instance of Bicycle class */
		Bicycle b1 = new Bicycle();
		
		/*Invoke method object b1 of type Bicycle*/ 
		b1.printState();
	}
}
