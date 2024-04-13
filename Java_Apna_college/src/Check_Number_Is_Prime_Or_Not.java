import java.util.Scanner;

public class Check_Number_Is_Prime_Or_Not {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = input.nextInt();
        int flag = 1;
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                flag=0;
                System.out.println("Not a prime number");
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("Given number is prime number ");
        }
    }
}
