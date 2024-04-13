import java.util.Scanner;

public class ProductOfTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter value of a : ");
        int a = input.nextInt();
        System.out.print("Please enter value of b : ");
        int b = input.nextInt();

        int prod = a*b;
        System.out.print(prod);
    }
}
