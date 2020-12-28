// Lab 9: Multithreading
// Driver class

package lab9;

public class Driver {
    public static void main(String[] args) {
        Data d = new Data();
        int nop = d.getNoPlayers();
        Thread[] players = new Thread[nop];
        Thread monitor;

        // Q4(a)
        // player threads
        for(int i = 0; i < nop; i++) {
            players[i] = new Thread(new Player(d));
            players[i].start();
        }

        // Q4(b)
        // monitor thread
        monitor = new Thread(new Monitor(d));
        monitor.start();
    }
} // end of class Driver.