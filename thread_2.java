class MT3 implements Runnable
{
    String word;
	MT3(String w)
	{
	    word = w;
	}
	public void run()
	{
	    try {
	        for (int i = 0;i < 20 ;i++ )
	        {
	            System.out.println(word);
	            Thread.sleep(100);
	        }
	    } catch(Exception e) {
	        System.out.println("ERROR");
	    } 
	}
 public static void main (String[] args) {
        Runnable obj1 = new MT3("Word1");
        Runnable obj2 = new MT3("Word2");
        Thread obj11 = new Thread(obj1);
        obj11.start();
        Thread obj22 = new Thread(obj2);
        obj22.start();
	}
}