package OptionalClass;

public class OptionalExample {

	public static void main(String[] args) {
	
		String employes[]=new String[10];
		
		String employe=employes[2].toUpperCase();
		
		System.out.println(employe);
		
		
//	output	
		
//		Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toUpperCase()" because "employes[2]" is null
//		at JAVA_8_practICE/OptionalClass.OptionalExample.main(OptionalExample.java:8)

	}

}
