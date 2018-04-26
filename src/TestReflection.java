import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class TestReflection {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		String x="click";
		
		
		Method method =TestReflection.class.getMethod(x, String.class);
		
		String Classname=TestReflection.class.getName();
		
		System.out.println(Classname);
		method.invoke(method, "reflection method") ;
	}
	
	public static void click(String x)
	
	{
		System.out.println("Click method" +x);
	}
	
	

}
