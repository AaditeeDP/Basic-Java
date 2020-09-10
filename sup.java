class Anon
{
	int a = 10;
}
class A extends Anon
{
	int a  = 15;
	void B()
		{
			System.out.println("The value of a in class A is:"+a);
			System.out.println("The value of a in class Anon is:"+super.a);
		}
}
class Output{
	public static void main(String args[])
		{
			A obj = new A();
			obj.B();
	}
}