import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter value of a : ");
        int a = input.nextInt();
        System.out.print("Please enter value of b : ");
        int b = input.nextInt();
        System.out.print("Please enter operaor : ");
        char oper = input.next().charAt(0);

        switch (oper) {
            case '+' :
                System.out.println(a+b);
                break;
            case '-' :
                System.out.println(a-b);
                break;
            case  '*' :
                System.out.println(a*b);
                break;
            case '/' :
                System.out.println(a/b);
                break;
            case '%' :
                System.out.println(a%b);
                break;
            default:
                System.out.println("Wrong operator ");
        }


    }
}
