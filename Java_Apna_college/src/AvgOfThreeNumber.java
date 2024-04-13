import java.util.Scanner;

public class AvgOfThreeNumber {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Please enter first number : ");
        float a = input.nextFloat();
        System.out.print("Please enter second number : ");
        float b = input.nextFloat();
        System.out.print("Please enter third number : ");
        float c= input.nextFloat();
        System.out.print("Average of " + a+ " , "+ b + " & " + c +" is : "+Avg_Of_Three_number(a,b,c));

    }
    public static float Avg_Of_Three_number(float x,float y, float z)
    {
        float avg = (x+y+z)/3;

        return avg;
    }
}
