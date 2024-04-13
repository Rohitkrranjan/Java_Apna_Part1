import java.util.Scanner;

public class Print_N_Number {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Please enter number : ");
        int n = input.nextInt();
        int count = 1;
        while(count<=n)
        {
            System.out.println(count);
            count++;
        }
    }
}
