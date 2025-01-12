package Algorithms.fibonacci;

import java.util.Arrays;

public class Fib_No_Memo {
    static Integer[] memo = new Integer[1000];
    static int counter = 0;

    public static void main(String[] args) {
        int n = 400;
        System.out.println("\nFib of " + n + " = " + fib(n));
        System.out.println("\nFib of " + n + " = " + fib_no_memo(n));
        System.out.println("\nCounter: " + counter);
        System.out.println("\nMemo: " + Arrays.toString(memo));
    }

    public static int fib_no_memo(int n) {
        counter++;
        if (memo[n] != null) {
            return memo[n];
        }
        if (n == 0 || n == 1) {
            memo[n] = n;
            return n;
        }
        memo[n] = fib_no_memo(n - 1) + fib(n - 2);
        return memo[n];
    }

    public static int fib(int n) {
        int[] fibList = new int[n + 1];
        fibList[0] = 0;
        fibList[1] = 1;

        for (int index = 2; index <= n; index++) {
            counter++;
            fibList[index] = fibList[index - 1] + fibList[index - 2];
        }
        return fibList[n];
    }
}
