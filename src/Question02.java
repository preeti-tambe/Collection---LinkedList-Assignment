import java.util.Iterator;
import java.util.LinkedList;

public class Question02 {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList <Object> l= new LinkedList<>();
		l.add("green");
		l.add("black");
		l.add("white");
		l.add("pink");
		l.add(25);
		l.add(02.36);
		l.add('f');
		
		Iterator a=l.iterator();
		
		while(a.hasNext())
		{
			System.out.println(a.next());
		}
		
		
	
		
	}

}
