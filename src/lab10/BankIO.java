package lab10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BankIO {
    public static void readFile(String filename, Bank bank) throws IOException {
        Scanner in = null;
        try {
            in = new Scanner(new File(filename));
            
            System.out.println("Taking input from file.");
            while (in.hasNextLine()) {
                // System.out.println("Taking input!");
                bank.add(readAccount(in));
            }
        } catch (FileNotFoundException e) {
            System.out.println("\n*****ERROR*****: " + e.getMessage() + "\n");
        }
    }

    public static BankAccount readAccount(Scanner in) throws IOException {
        String[] line = in.nextLine().split(" ");

        try {
            int accountNumber = Integer.parseInt(line[0]);
            double initialBalance = Double.parseDouble(line[1]);
            
            if (accountNumber < 10000 || accountNumber > 99999 || initialBalance < 0) {
                throw new IOException("Invalid input detected in given file.");
            }
            return new BankAccount(initialBalance, accountNumber);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    public static void writeFile(String filename, Bank bank) {
        PrintWriter out;
        try {
            out = new PrintWriter(filename);
            System.out.println("Printing file.");
            out.print(bank);
            out.flush();
        } catch (FileNotFoundException e) {
            System.out.println("\n*****ERROR*****: " + e.getMessage() + "\n");
        }
    }
}

class BankFileTester {
    public static void main(String[] args) {
        Bank bank = new Bank(7);
        Scanner in = new Scanner(System.in);
        String inFile, outFile;

        System.out.print("Enter input file name for accounts: ");
        inFile = in.next();
        

        try {
            BankIO.readFile(inFile, bank);
        } catch (Exception e) {
            System.out.println("\n*****ERROR*****: " + e.getMessage() + "\n");
            System.out.print("Enter input file name for accounts: ");
            inFile = in.next();
        }
        // System.out.println(bank);

        System.out.print("Enter ouput file name for accounts: ");
        outFile = in.next();
        BankIO.writeFile(outFile, bank);
        
        in.close();
    }
}
