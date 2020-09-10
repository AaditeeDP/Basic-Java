import java.util.*;
abstract class Name{ 
   public abstract void det();
}
class Detail extends Name {

   public void det(){
	Scanner scan = new Scanner(System.in);
	System.out.println("Name: ");	
	String a = scan.nextLine();
	System.out.println("Favourite color:");
	String b = scan.nextLine();
	System.out.println("Details: ");
	System.out.println(a);
	System.out.println(b);
   }
   public static void main(String args[]){
	Name obj = new Detail();
	obj.det();
   }
}