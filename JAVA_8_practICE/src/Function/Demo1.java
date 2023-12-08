package Function;

import java.util.function.Function;

public class Demo1 {

	public static void main(String[] args) {
		
		// I am passing String is a parameter and it will return the integer out put
		
		Function<String,Integer> s = name->name.length();
		System.out.println(s.apply("Alakuntlavasu"));
		System.out.println(s.apply("varunTaj"));
		System.out.println(s.apply("AlakuntlaNaveen"));
		System.out.println(s.apply("Rajesh"));
		System.out.println("suhasini");
		
		

	}
	

}
