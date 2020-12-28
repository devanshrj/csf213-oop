// Lab 9: Multithreading
// Player class

package lab9;

import java.util.Random;

public class Player implements Runnable {
    // shared Data object
    private Data d;

    Random rand = new Random();
    
    // constructor
    public Player (Data d) {
        this.d = d;
    }

    // run()
    public void run() {
        // Q3(a)
        Thread t = Thread.currentThread();
        System.out.println("Thread created: " + t.getName());
        Object obj = d.getLock();

        synchronized(obj) {
            // Q3(b)
            while (d.getMChance()) {
                try {
                    obj.wait();
                } catch (Exception e) {
                }
            }

            // toss coin and wait
            d.setResult(rand.nextInt(2));

            // Q3(c)
            // System.out.println("Coin tossed.");
            d.setMChance(true);
            d.setPChance(false);
            obj.notifyAll();
            // System.out.println("Player done.");
        }
    } // end of run().
} // end of class Player.
