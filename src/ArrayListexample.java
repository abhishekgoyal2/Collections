import java.util.ArrayList;


public class ArrayListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 @SuppressWarnings("serial")
		ArrayList<String> cities = new ArrayList<String>(){{
			   add("Delhi");
			   add("Agra");
			   add("Chennai");
			   }};
			   
			   
		  System.out.println("Content of Array list cities:"+cities);
		
		ArrayList<String> list1= new ArrayList<String>();
		list1.add("one") ;
		list1.add("second") ;
		list1.set(1, "test");//Used for updating an element. It replaces the element present at the specified index with the object o.
		
		int pos=list1.indexOf("one");//Gives the index of the object o. If the element is not found in the list then this method returns the value -1.
		System.out.println(pos);
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		
		boolean bol=list1.contains("test");//It checks whether the given object o is present in the array list if its there then it returns true else it returns false.
		System.out.println(bol);
	
		System.out.println(list1);
		
		System.out.println(list1.size());//get String list size
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		
		ArrayList<Integer> intlist= new ArrayList<Integer>();
		
		intlist.add(1);
		intlist.add(2);
		intlist.add(3);
//		System.out.println(arraysize);
		
		intlist.remove(2);
		intlist.add(2, 2);
		intlist.add(3, 2);
		int arraysize= intlist.size();
		System.out.println(arraysize);
		
	}

}
