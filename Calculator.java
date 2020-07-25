package MyPackage;
import java.util.Scanner;
import java.lang.Math;
public class Calculator {
    public static void main(String[] args)
    {
        int a, b;
        double c;
        char op ;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the two operands");
        a = reader.nextInt();
        b = reader.nextInt();
        System.out.println("Enter the operator");
        op = reader.next().charAt(0);
        switch(op) {
            case '+':
                c = a + b;
                break;
            case '-':
                c = a - b;
                break;
            case '*':
                c = a * b;
                break;
            case '/':
                c = a/b;
                break;
            case '^':
                c = Math.pow(a, b);
                break;
            default:
                System.out.println("wrong operator input.");
                return;
        }
        System.out.println("\nThe result is given as follows:\n");
        System.out.println(a + " " + op + " " + b + " = " + c);
    }
}
