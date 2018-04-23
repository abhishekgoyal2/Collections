import java.util.Hashtable;


public class TesthashtableSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,String> hastab =new Hashtable<String,String>();
		hastab.put("Course1", "Java");
		hastab.put("Course2", "Selenium");
		hastab.put("Course3", "QTP");
	
		
		Hashtable<String,String> hastab1 =new Hashtable<String,String>();
		hastab.put("location1", "delhi");
		hastab.put("location2", "noida");
		hastab.put("location3", "Banglore");
		
		Hashtable<String,Hashtable<String,String>> hastab2 =new Hashtable<String,Hashtable<String,String>>();
		hastab2.put("institute", hastab);
		hastab2.put("country", hastab1);
		
		System.out.println(hastab2.get("institute").get("Course1"));
		System.out.println(hastab2.get("country").get("location1"));
		
	}

}
