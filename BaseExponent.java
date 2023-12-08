import java.util.Scanner;

public class BaseExponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int base = 2, exponent = 3;

    long result = 1;

    while (exponent != 0) {
      result *= base;
    
    }

    System.out.println("Answer = " + result);
    }
}
