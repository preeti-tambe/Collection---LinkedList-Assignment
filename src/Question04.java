import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList <Object> l= new LinkedList<>();
		l.add("green");
		l.add("black");
		l.add("white");
		l.add("pink");
		l.add(25);
		l.add(02.36);
		l.add('f');
		
		ListIterator a=l.listIterator();
		
		while(a.hasNext())
			
		{
			a.hasNext();
			//System.out.println(a.next());
		}
		while(a.hasPrevious())
		{
			System.out.println(a.hasPrevious());
		}
		
		
	
		
	}

}
