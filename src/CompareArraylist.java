import java.util.ArrayList;


public class CompareArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> listofcountries = new ArrayList<String>();
		   listofcountries.add("India");
		   listofcountries.add("US");
		   listofcountries.add("China");
		   listofcountries.add("Denmark");
		   
		   ArrayList<String> listofcountries2 = new ArrayList<String>();
		   listofcountries.add("India");
		   listofcountries.add("US1");
		   listofcountries.add("China");
		   listofcountries.add("Denmark");
		   
		 //Storing the comparison output in ArrayList<String>
	          ArrayList<String> al3= new ArrayList<String>();
	          for (String temp : listofcountries)
	              al3.add(listofcountries2.contains(temp) ? "Yes" : "No");
	          System.out.println(al3);

	          //Storing the comparison output in ArrayList<Integer>
	          ArrayList<Integer> al4= new ArrayList<Integer>();
	          for (String temp2 : listofcountries)
	               al4.add(listofcountries2.contains(temp2) ? 1 : 0);
	          System.out.println(al4);
		   
	}

}
