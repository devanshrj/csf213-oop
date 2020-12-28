// Lab 9: Multithreading
// Monitor class

package lab9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Monitor implements Runnable {
    // shared Data object
    private Data d;

    // counts
    private int tails = 0;
    private int heads = 0;

    // constructor
    public Monitor (Data d) {
        this.d = d;
    }

    // run()
    public void run() {
        // Q2(a)
        // Monitor thread will run for all players
        // System.out.println("Monitor created.");
        for(int i = 0; i < d.getNoPlayers(); i++) {
            // Q2(b)
            Object obj = d.getLock();

            synchronized(obj) {
                // Q2(c)
                // Monitor will execute when it is not P's chance
                while (d.getPChance()) {
                    try {
                        // System.out.println("Monitor waiting.");
                        obj.wait();
                    } catch (Exception e) {
                    }
                }

                // Monitor function
                System.out.println("Monitor is going to read value ..."); 
                if (d.getResult() == 0) {
                    tails++; 
                } else {
                    heads++;
                }
            
                // Q2(d)
                System.out.println(heads + " " + tails);
                d.setPChance(true);
                d.setMChance(false);
                obj.notifyAll();
            }
        }

        // Q2(e)
        // if (heads + tails == 10) {
        writer();
        // }
    } // end of run().

    void writer() {
        PrintWriter outStream = null;
        try {
            // include print statements in try block as well
            outStream = new PrintWriter(new FileOutputStream("src/lab9/out.txt", false));
            outStream.println("Results:");
            outStream.println("Number of heads: " + this.heads);
            outStream.print("Number of tails: " + this.tails);
        } 
        catch (IOException e) {
            // IOException catches all possible exceptions here
            // FileNotFound only takes care of file
            System.out.println("Error: File Not Found.");
            System.exit(0);
        }
        finally {
            outStream.close();
        }
    }
} // end of class Monitor.