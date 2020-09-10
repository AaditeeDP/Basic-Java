//single heritance
class One
{
	public void a()
		{
			System.out.println("Class One is being executed");
			System.out.println("Class One is super class");
		}
}
class Two extends One
{
	public void b()
		{
			System.out.println("Class Two is being executed");
		}
}
class Executor
{
	public static void main(String args[])
	{
		Two obj = new Two();
		obj.a();
		obj.b();
	}
}

