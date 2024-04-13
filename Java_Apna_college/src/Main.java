import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Please enter value of a : ");
        int a = input.nextInt();
        System.out.print("Please enter value of b : ");
        int b = input.nextInt();
        int sum = a + b;

        System.out.print("Sum of " + a + " and "+  b + " is " + sum);
    }
}