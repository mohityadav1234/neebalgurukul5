import java.util.Scanner;

public class Sqr {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("number  : ");   

int sum = 0; 
System.out.print("number of 5 series : ");
for (int i = 1; i <= 5; i++) {

int sqr = i * i;
sum = sum + sqr;
 } 
 System.out.println(" "+sum);
    }
    }