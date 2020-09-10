//Multiple_Inheritance
import java.util.*;
import java.util.Scanner;

interface Personal
{
	public void a();
}
interface Hobby
{
	public void b();
}
interface Language
{
	public void c();

}
interface Display extends Language,Hobby, Personal
{
	public void disp();

}

class Student
{
	public static void main(String args[])
	{
		Display obj = new Display()
			{
			Scanner scan = new Scanner(System.in);
				public void a()
				{
					System.out.println("Enter the name of the student");
					String a = scan.nextLine();
					System.out.println("Enter the Rollno. of the student");
					int b = scan.nextInt();
					System.out.println("_______________________________________________________________");
					System.out.println("Student name:"+a);
					System.out.println("Roll no.: "+b);
					System.out.println("_______________________________________________________________");
				}
				public void b()
				{
					String [] arr = new String[10];
					System.out.println("Enter the number of hobbies the student has:");
					int n = scan.nextInt();
					System.out.println("Enter hobbies:");
					for(int i = 0; i < n; i++)
					{
						arr[i] = scan.next();
					}
					System.out.println("_______________________________________________________________");
					System.out.println("Hobbies: ");
					for(int i = 0; i < n; i++)
					{
						System.out.println(arr[i]);
					}
					System.out.println("_______________________________________________________________");
					
				}
				public void c()
				{
					String [] brr = new String[10];
					System.out.println("Enter the number of programming languages the student has learnt:");
					int m = scan.nextInt();
					for(int i = 0; i < m; i++)
					{
						brr[i] = scan.next();
					}
					System.out.println("_______________________________________________________________");
					System.out.println("Programming languages learnt: ");
					for(int i = 0; i < m; i++)
					{
						System.out.println(brr[i]);
					}
				}
				
				public void disp()
				{
					System.out.println("_______________________________________________________________");
					System.out.println("Student details:");
					System.out.println("_______________________________________________________________");
				}
		};
		obj.disp();
		obj.a();
		obj.b();
		obj.c();
	}

}
