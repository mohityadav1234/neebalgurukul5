import java.util.Scanner;

public class printEvenFibonacciNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int n = 10;
        printEvenFibonacciNum(n);
    }

    public static void printEvenFibonacciNum(int n) {
        System.out.printf("The first %d even Fibonacci numbers are:%n", n);

        int first = 0, second = 1;

        for (int i = 0, count = 0; count < n; i++) {
            int current = first;
            if (current % 2 == 0) {
                System.out.print(current + " ");
                count++;
            }

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
