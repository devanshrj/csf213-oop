// Lab 9: Multithreading
// Data class -> shared data object
// Player and Monitor threads are going to use an object of Data for the purpose of communication.

package lab9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Data {
    // result of coin toss
    private int result;

    // flags for communicating
    private boolean pChance;
    private boolean mChance;

    private int noPlayers;

    // Object for synchronization
    private Object lock;

    public Data() {
        Scanner inStream = null;
        try {
            inStream = new Scanner(new FileInputStream("src/lab9/input.txt"));
            result = inStream.nextInt();
            pChance = inStream.nextBoolean();
            mChance = inStream.nextBoolean();
            noPlayers = inStream.nextInt();
        } catch (FileNotFoundException e) {
            System.out.println("input.txt not found.");
            System.exit(0);
        } finally { 
            inStream.close();
        }
        this.lock = new Object();
    }

    // public static void main(String[] args) {
    //     Data d = new Data();
    //     System.out.println(d.getResult()+ " " + d.getPChance() + " " + d.getMChance() + " " + d.getNoPlayers());
    // }
    
    // getter methods
    int getResult() {
        return result;
    }
    
    boolean getPChance() {
        return pChance;
    }

    boolean getMChance() {
        return mChance;
    }

    int getNoPlayers() {
        return noPlayers;
    }

    Object getLock() {
        return lock;
    }

    // setter methods
    void setResult(int result) {
        this.result = result;
    }

    void setPChance(boolean pChance) {
        this.pChance = pChance;
    }

    void setMChance(boolean mChance) {
        this.mChance = mChance;
    }

    void setNoPlayers(int noPlayers) {
        this.noPlayers = noPlayers;
    }

    void setLock(Object lock) {
        this.lock = lock;
    }
} // end of class Data.
