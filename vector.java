import java.util.*;

class Vec {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Vector vec = new Vector(4,6);
        vec.add("HEY");
        vec.add("hello");
        vec.add("Hola");
        System.out.println("Size is: "+vec.size());
        System.out.println("Default capacity increment is: "+vec.capacity());
        System.out.println(vec);
        System.out.println("First element of vector is: "+vec.firstElement());
        System.out.println("Last element of vector is: "+ vec.lastElement());
        vec.removeElementAt(2);
        System.out.println(vec);
        System.out.println("Enter the number of words that you wish to add to vector:");
        int a = scan.nextInt();
        System.out.println("Enter the elements:");
        for(int i = 1; i <= a; i++)
        {
            vec.add(scan.next());
        }
        System.out.println(vec);
        vec.removeAllElements();
        System.out.println(vec);
        System.out.println("Enter the number of words that you wish to add to vector:");
        int b = scan.nextInt();
        System.out.println("Enter the elements:");
        for(int i = 1; i <= b; i++)
        {
            vec.add(scan.next());
        }
        Vector vec2 = new Vector(4,6);
        System.out.println("Enter the number of words that you wish to add to vector2:");
        int c = scan.nextInt();
        System.out.println("Enter the elements:");
        for(int i = 1; i <= c; i++)
        {
            vec2.add(scan.next());
        }
        System.out.println(""+vec.containsAll(vec2));
    }
}