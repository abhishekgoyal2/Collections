import java.util.Hashtable;


public class Testhashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<String,String> hastab =new Hashtable<String,String>();
		hastab.put("name", "Ravi");
		hastab.put("location", "noida");
		
		System.out.println(hastab.get("location"));
		hastab.put("location", "delhi");

		System.out.println(hastab.get("location"));
	}

}
