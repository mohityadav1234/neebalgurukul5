import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     System.out.print("number  : ");   
     double sum = 0.0;

     for( int i= 1 ; i<= n ; i++){
        sum = sum + (1.0/i);
     }

System.out.print("sum of series : ");

 System.out.println(" "+sum);
    }
    }