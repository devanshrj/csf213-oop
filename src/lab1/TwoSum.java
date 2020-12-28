package lab1;

public class TwoSum {
  
    // index 0 is the sum to look for
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int arr[] = new int[args.length - 1];

        for(int i = 1; i < arr.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        

        for(int i = 0; i < arr.length; i++) {
            int sum = x - i;
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[j] == sum) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
    
}