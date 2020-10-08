import java.util.*;
import java.io.*; 
class E{
    void method() throws IOException{
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter a number");
     int a = sc.nextInt();
     if(a < 0)
     {
         throw new IOException("ERROR FOUND THE ENTERED NUMBER IS NEGATIVE");
     }
     else{
         System.out.println("The number entered is positive");
     }
     System.out.println("Input a dividend");
     int b = sc.nextInt();
     System.out.println("Input a divisor");
     int c  = sc.nextInt();
     if (c == 0)
     {
          throw new IOException("ERROR FOUND, THE ENTERED DIVISOR IS ZERO");
      }
    else
{
         System.out.println(""+b/c);
}
    }
}
class E2{
     public static void main(String args[])throws IOException{      
     E obj = new E();
     obj.method();
    System.out.println("Statement after throws expression being processed");
  }
}