import java.util.*;
class Exceptio{
    public static void main(String args[]){
    int c;
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter your date of birth:");
    int a = sc.nextInt();
    if(a > 31)
    {
        throw new ArithmeticException("There are no months with more than 31 days according to calendar follwed on Earth as of now, try being born later");
    }
    else
    {
        System.out.println("Enter your month of birth:");
        int b = sc.nextInt();
        if(b > 12)
        {
          throw new ArithmeticException("There is no year with more than 12 months according to calendar follwed on Earth as of now, try being born later");  
        }
        else
        {
            System.out.println("Hello fellow human!");
        }
    }
    }
}