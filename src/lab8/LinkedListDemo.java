// Linked List Demo

package lab8;

import java.util.*;

class ReservationCounter {
    LinkedList<String> ReservationQueue;

    private ReservationCounter() {
        // initializing the ReservationQueue
        ReservationQueue = new LinkedList<String>();
    }

    // Adding an element to the linkedlist from the end just like in a queue
    public void standInLine(String customer) {
        ReservationQueue.add((String) customer);
    }

    // default removal of the element is done from the front
    public void leaveTheLine() {
        ReservationQueue.remove();
    }

    // demonstration of how the first element of list can be accessed.
    public String giveTicket() {
        return (String) ReservationQueue.getFirst();
    }

    // retrieving data from anywhere in the list
    public String checkTheCustomerAt(int position) {
        return (String) ReservationQueue.get(position);
    }

    public static ReservationCounter InitializeCounter() {
        return new ReservationCounter();
    }

    // size of the list
    public int customersInLine() {
        return ReservationQueue.size();
    }
} // end of class ReservationCounter.

public class LinkedListDemo {
    public static void main(String[] args) {
        // getting an instance of ReservationCounter
        ReservationCounter counter = ReservationCounter.InitializeCounter();

        // add elements
        counter.standInLine("Amitabh");
        counter.standInLine("Aamir");
        counter.standInLine("Salman");
        counter.standInLine("Tom Cruise");
        for (int position = 0; position < counter.customersInLine(); position++) {
            System.out.println(
                    "Customer at " + (position + 1) + " place in line is " + counter.checkTheCustomerAt(position));
        }

        // get and remove elements
        System.out.println("Ticket given to " + counter.giveTicket());
        counter.leaveTheLine();

        counter.standInLine("Emma Watson");

        System.out.println("Ticket given to " + counter.giveTicket());
        counter.leaveTheLine();

        System.out.println("Customer in position 2 is " + counter.checkTheCustomerAt(1));
        System.out.println("There are still " + counter.customersInLine() + " people in line");
    }
} // end of class LinkedListDemo
