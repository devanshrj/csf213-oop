// Driver for Student class.

package lab8;

import java.util.*;

public class TestStudent {
    public static void main(String args[]) {
        // create an array list
        ArrayList<Student> studentList = new ArrayList<Student>();
        // add elements to the array list
        studentList.add(new Student("Ramesh","Male",18)); 
        studentList.add(new Student("Reeta","Female",19)); 
        studentList.add(new Student("Seema","Female",18)); 
        studentList.add(new Student("Suresh","Male",20));
        System.out.println("Original contents of list: " + studentList);

        Iterator<Student> itr = studentList.iterator();
        while(itr.hasNext()) {
            Object element = itr.next(); 
            System.out.print(element + "\n");
        } 
        System.out.println();

        // modify objects being iterated
        ListIterator<Student> litr = studentList.listIterator();
        while(litr.hasNext()) {
            Student element = (Student) litr.next(); 
            if(element.getGender().equals("Male")){
                element.setName("Mr." + element.getName()); 
            } else{
                element.setName("Miss." + element.getName()); }
            litr.set(element); 
        }
        System.out.println("Modified contents of list: " + studentList);

        itr = studentList.iterator();
        while(itr.hasNext()) {
            Object element = itr.next(); 
            System.out.print(element + "\n");
        }
        System.out.println();

        // now, display the list backwards 
        System.out.println("Modified list backwards: ");
        while(litr.hasPrevious()) {
            Object element = litr.previous(); 
            System.out.print(element + "\n");
        }
        System.out.println(); 
    }
}
