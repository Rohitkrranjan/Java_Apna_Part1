import java.util.Scanner;

public class Math_Class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter value of a : ");
        int a = input.nextInt();
        System.out.print("Please enter value of  b : ");
        int b = input.nextInt();
        Math_Class(a,b);

    }

    public static void Math_Class(int x,int y)
    {
        System.out.println("Minimum in x and y is "+Math.min(x,y));
        System.out.println("Maximum in x and y is "+Math.max(x,y));
        System.out.println("Square root of a is : " + Math.sqrt(x));
        System.out.println("Square root of b is : "+Math.sqrt(y));
        System.out.println(" x to the power of y is : " +Math.pow(x,y));
        System.out.println("Absolute of x is : "+ Math.abs(x));




    }
}
