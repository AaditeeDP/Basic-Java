import java.util.*;
class MT implements Runnable{
    public void run()
    {
        try{
            System.out.println("Inside try block");
            System.out.println ("Thread number:" + Thread.currentThread().getId() + " is running");
        }
        catch(Exception e)
        {
            System.out.println("An Exception has been detected and program shall terminate");
        }
    }
}
class MT2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
       System.out.println("Enter the number of threads you wish to run:");
       int a = sc.nextInt();
       for (int i=0; i<a; i++) 
        { 
            Thread obj = new Thread(new MT()); 
            obj.start(); 
        } 
    }
}