import java.util.ArrayList;


public class ArrayListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list1= new ArrayList<String>();
		list1.add("one") ;
		list1.add("second") ;
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
	}

}
