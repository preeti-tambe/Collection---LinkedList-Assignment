import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class classroomLinkedList {

	public static void main(String[] args) {
		//QUESTION 01
		System.out.println("QUESTION 01\nOUTPUT : append the list");
		
		LinkedList<String> l=new LinkedList<String>();
		
		l.add("red");
		l.add("green");
		l.add("black");
		l.add("white");
		l.add("pink");
		l.add("yellow");
		System.out.println(l);
		
		//QUESTION 02
		System.out.println("\nQUESTION 02\nOUTPUT : itrate  the list");
		
		int n=l.size();
		for(int i=0;i<n;i++)
		{
			System.out.println(l.get(i));
		}
		
		//QUESTION 05
		System.out.println("\nQUESTION 05\nOUTPUT : insert specified element ");
		
		l.add(1, "Yellow");
		System.out.println(l);
		
		//QUESTION 06
		System.out.println("\nQUESTION 06\nOUTPUT : insert element at first and last position ");
		l.addFirst("COLOURS");
		l.addLast("colours");
		System.out.println(l);
		
		//QUESTION 10
		System.out.println("\nQUESTION 10\nOUTPUT : get 1st and last occurrence  ");
		
		l.getFirst();
		l.getLast();
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		//QUESTION 11
		System.out.println("\nQUESTION 11\nOUTPUT :display data with their index  ");
		
		int x = l.size();
		for(int i=0;i<x;i++)
		{
			System.out.println("element at index "+i+ " : "+l.get(i));
		}
		
		//QUESTION 12
		System.out.println("\nQUESTION 12\nOUTPUT : remove element from specified list  ");
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		
		//QUESTION 13
		
		System.out.println("\nQUESTION 13\nOUTPUT : remove  1st and last element  ");
		System.out.println("before "+l);
		l.removeFirst();
		l.removeLast();
		System.out.println("after "+l);
		
		//QUESTION 14
		System.out.println("\nQUESTION 14\nOUTPUT :remove all element ");
		System.out.println("before "+l);
		//l.removeAll(l);
		System.out.println("after "+l);
		
		//QUESTION 15
				
		System.out.println("\nQUESTION 15\nOUTPUT :swapping list  ");
		System.out.println(l);
		Collections.swap(l, 0, 1);
        System.out.println(l);	
        
      //QUESTION 16
      System.out.println("\nQUESTION 16\nOUTPUT : shuffling list  ");
      System.out.println(l);
      Collections.shuffle(l);
      System.out.println(l);
      
    //QUESTION 17
    System.out.println("\nQUESTION 17\nOUTPUT :join two list ");
    
    LinkedList<String> k=new LinkedList<String>();
    k.add("rose");
    k.add("lotus");
    k.add("lily");
    k.add("catus");
    System.out.println("list 1 "+l);
    System.out.println("list 2"+k);
    k.addAll(l);
    System.out.println(k);
    
    
    //QUESTION 19
    System.out.println("\nQUESTION 19\nOUTPUT : pop the element and remove it ");
    System.out.println("list "+k);
    System.out.println("removed element ="+k.pop());
    System.out.println(k);
    
  //QUESTION 20
    System.out.println("\nQUESTION 20\nOUTPUT : peek the element ");
    System.out.println("list "+k);
    System.out.println("removed element ="+k.peek());
    System.out.println(k);
    
  //QUESTION 21
    System.out.println("\nQUESTION 21\nOUTPUT : peek the last element ");
    System.out.println("list "+k);
    System.out.println("removed element ="+k.peekLast());
    System.out.println(k);
    
  //QUESTION 22
    System.out.println("\nQUESTION 22\nOUTPUT : check element exist or not in the array ");
    
    if(k.contains("catus"))
    {
    	System.out.println("element present in th array list");
    }
    else
    {
    	System.out.println("element not present in th array list");
    }
    
  //QUESTION 23
    System.out.println("\nQUESTION 23\nOUTPUT : convert linkedlist to arraylist ");
    
    LinkedList<String> ll = new LinkedList<String>();
    ll.add("honda");
    ll.add("yamaha");
    ll.add("suzuki");
    ll.add("tvs");
    System.out.println("LinkedList"+ll);
    
   // ArrayList<String> al  = new ArrayList<String>(ll);
    System.out.println("Arraylist ");
   /* for(String w: al)
    {
    	System.out.println(w);
    }*/
    
    
  //QUESTION 26
    System.out.println("\nQUESTION 26\nOUTPUT : Replace element in linkedlist ");
    System.out.println("before updating"+ll);
    ll.set(1, "java");
    System.out.println("after updating"+ll);

    
    
    
		
		
		
				
		
		

	}

}
