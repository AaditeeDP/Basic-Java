import java.util.Scanner;
 class Strbuf
{
    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the department");
	String a = scan.nextLine();
	StringBuffer dept = new StringBuffer("Department: ");
	dept.append(a);
	System.out.println(dept);
        
	StringBuffer roll = new StringBuffer("10191");
	System.out.println("Enter your Sr no.");
	int b = scan.nextInt();
	roll.append(b);
	System.out.println("Your Roll no. is:" + roll);

	StringBuffer word = new StringBuffer("WELCOME");
	System.out.println("String before operation: " + word+"\n");
	word.reverse();
	System.out.println("After : \n" +word);

	StringBuffer ani = new StringBuffer("ASSJFHJ GMKFMLS EWOGKM LSSD FEKB,FLSMLFS GRKOMLDSF ");
	System.out.println(ani);
	System.out.println("Enter the range of alphabets you want to delete");
	int d = scan.nextInt();
	int e = scan.nextInt();
	ani.delete(d, e);
	System.out.println(ani);

	StringBuffer name = new StringBuffer("My name is:");
	System.out.println(name);
	name.insert(11, "Anthony Gonsalves");
	System.out.println(name);
    }
}