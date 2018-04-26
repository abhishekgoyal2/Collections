import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Collectioncopies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Collections.ncopies method can be used when we need to initialize the ArrayList with the same value for all of its elements. Syntax: count is number of elements and element is the item value
		ArrayList<String> intlist = new ArrayList<String>(Collections.nCopies(4, "Webdriver"));//
		  System.out.println("ArrayList items: "+intlist);
		  
		  ArrayList<String> list1= new ArrayList<String>();
			list1.add("one") ;
			list1.add("second") ;
			System.out.println("Advanced For Loop"); 		
		      for (String num : list1) { 		      
		           System.out.println(num); 		
		      }
		      
		      ArrayList<Integer> intlist1= new ArrayList<Integer>();
				
				intlist1.add(1);
				intlist1.add(2);
				intlist1.add(3);
				
				for(int num:intlist1)
				{
					 System.out.println(num); 	
				}
				
				System.out.println("Iterator");
			      Iterator iter = intlist1.iterator();
			      while (iter.hasNext()) {
			         System.out.println(iter.next());
	}

}
}
