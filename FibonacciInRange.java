import java.util.Scanner;

public class FibonacciInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound: ");
        int upperBound = scanner.nextInt();

        System.out.printf("Fibonacci numbers in the range [%d, %d]:%n", lowerBound, upperBound);
        printFibonacciInRange(lowerBound, upperBound);
    }

    public static void printFibonacciInRange(int lowerBound, int upperBound) {
        int first = 0, second = 1, next;

        while (first <= upperBound) {
            if (first >= lowerBound) {
                System.out.print(first + " ");
            }

            next = first + second;
            first = second;
            second = next;
        }
    }
}