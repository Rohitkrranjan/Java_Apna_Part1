import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number : ");
        int a = input.nextInt();
        System.out.print("Sum of digit is : "+ Digit_Sum(a));

    }
    public static int Digit_Sum(int x){
        int sum=0;
        while(x>0)
        {
            int digit = x%10;
            sum = sum+digit;
            x=x/10;
        }
        return sum;

    }
}
