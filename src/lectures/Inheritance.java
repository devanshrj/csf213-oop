package lectures;

class Animal{
    String color="white"; 
    Animal(){
        System.out.println("animal is created"); 
    }
    void printColor(){
    System.out.println(color); }
}

class Dog extends Animal{
    String color="black";
    Dog(){
        System.out.println("dog is created"); 
    }
    // void printColor(){
    // super.printColor(); 
    // System.out.println(color); }
}

public class Inheritance {
    public static void main(String args[]){
        Dog d = new Dog();
        d.printColor();
    }
}