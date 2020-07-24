class Armstrong{
	public static void main(String args[])
		{
			int n, d = 0, a;
			int i;
			System.out.println("Enter the number to be tested");
			n = Integer.parseInt(args[0]);
			a = n;
			while( n > 0)
			{
				i = n % 10;
				n = n/10;
				d = d + (i * i* i);
			}
			if(a==d)
			{
				System.out.println("it is an armstrong number");
			}
			else
			{
				System.out.println("Not an armstrong number");
			}
		}
}