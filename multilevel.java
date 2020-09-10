//multilevel
class A{
	public void dis()
		{
			System.out.println("Inside class one");
		}
}
class B extends A{
	public void disp()
		{
			System.out.println("Inside class 2 that extends class one");
		}
}
class C extends B{
	public void display()
		{
			System.out.println("Inside class 3 that extends class 2");
		}
}
class Display {
	public static void main(String[] args) 
	{
      		C obj = new C();
      		obj.dis();
      		obj.disp();
      		obj.display();
   	}
}