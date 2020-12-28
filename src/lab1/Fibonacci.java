package lab1;

public class Fibonacci {

    /* calculate fibonacci(n) */
    public static int fibonacci(int idx) {
        if (idx <= 1) {
            return idx;
        }
        return fibonacci(idx - 1) + fibonacci(idx - 2);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;

        System.out.println("The first " + n + " Fibonacci numbers are");
        int arr[] = new int[n];
        for (int i=0; i < n; i++) {
            arr[i] = fibonacci(i);
            sum += arr[i];
            System.out.print(arr[i] + " ");
        }
        
        float avg = sum / (float)n;
        System.out.println("\nThe average is: " + avg);
    }
    
}