package Default_methods_java8;

interface IntrefaceOne
{
	default void anyMethod() 
	{
		System.out.println("Hi ******** from interface one");
	}
}

interface InterfaceTwo extends IntrefaceOne
{   
	
	default void anyMethod() 
	{
		System.out.println("Hi ....... from interface Two");
	} 
}

class One implements IntrefaceOne, InterfaceTwo
{   
	
	 public  void anyMethod() 
	{
		System.out.println("Hi ......  from class One");
	}
}
public class MyClass extends One implements IntrefaceOne,InterfaceTwo  
{

	public static void main(String[] args) 
	
	{
		new MyClass().anyMethod();

	}

}
