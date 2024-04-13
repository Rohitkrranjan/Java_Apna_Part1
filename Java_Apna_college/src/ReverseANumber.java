import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int n = input.nextInt();
        int ans=0;
        while(n>0)
        {
            int digit = n%10;
            ans= ans*10+digit;
            n=n/10;
        }
        System.out.print(ans);
    }
}
