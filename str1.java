import java.util.Scanner;

 class Str
{
    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter string 1");
	String a = scan.nextLine();
	int len = a.length();
	System.out.println("Length:"+len);

	System.out.println("Enter String 2");
	String b = scan.nextLine();
	System.out.println(a.concat(b));

	System.out.println("Enter the nth character you wish to see");
	int alpha = scan.nextInt();
	System.out.println("The character is:"+a.charAt(alpha));

    }
}

class expt
	{
		public static void main(String[] args)
			{
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter string 1:");
				String a = scan.nextLine();
				char b = a.charAt(2); //displays the character at specific position
				System.out.println(b);
				
				int c = a.codePointAt(1);//returns the unicode value of the character
				System.out.println(c);

				System.out.println("Enter string 2:");
				String d = scan.nextLine();
				int e = a.compareTo(d);
				System.out.println(e);
				
				System.out.println(a.concat(d));
				System.out.println(d.concat(d));
				System.out.println(d.concat(a));

				System.out.println("Enter string 3:");
				String g = scan.nextLine();
				boolean f = a.contains(g);
				System.out.println("String 1 contains String 3?"+f);
				
				boolean h = a.contentEquals(g);
				System.out.println("String 1 = String 3? "+h);

				boolean i = a.endsWith(g);
				System.out.println("Does string 1 ends with string 3?"+i);

				
			}
	}