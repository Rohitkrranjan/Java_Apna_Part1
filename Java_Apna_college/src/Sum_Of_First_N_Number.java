import java.util.Scanner;

public class Sum_Of_First_N_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = input.nextInt();
        int sum = 0;
        for(int i =0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
