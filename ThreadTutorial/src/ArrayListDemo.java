import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main (String args[])
	{
		ArrayList<String>ArrayListExample = new ArrayList<String>();
		ArrayListExample.add("Monika");
		ArrayListExample.add("Harsh");
		ArrayListExample.add("Himani");
		ArrayListExample.add("Mummy");
		ArrayListExample.add("papa");
		
		/*Iterator itr =ArrayListExample.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		for(String Obj:ArrayListExample)
		{
			System.out.println(Obj);
		}
	}

}
