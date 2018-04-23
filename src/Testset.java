import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Testset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer>  set1=new HashSet<Integer>();
		
	set1.add(1);
	set1.add(1);
	set1.add(3);

	Iterator<Integer> iterater= set1.iterator();

	while (iterater.hasNext())
	{
		System.out.println(iterater.next());
	}
		
	}

}
