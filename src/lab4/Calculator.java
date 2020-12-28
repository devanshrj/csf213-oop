package lab4;

import java.util.StringTokenizer;

public class Calculator {
        // method that returns maximum number
        public static int intfindMax(int arr[]) {
                int max = -100;
                for (int i = 0; i < arr.length; i++) {
                        if (max < arr[i])
                                max = arr[i];
                }
                return max;
        }

        // method that returns cube of the given number
        public static int intcube(int n) {
                return n * n * n;
        }

        // method that returns reverse words
        public static String reverseWord(String str) {
                StringBuilder result = new StringBuilder();
                StringTokenizer tokenizer = new StringTokenizer(str, " ");
                while (tokenizer.hasMoreTokens()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(tokenizer.nextToken());
                        sb.reverse();
                        result.append(sb);
                }
                return result.toString();
        }
}
