package Function;

import java.util.function.Function;

public class Demo {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f=a->a*a;
		System.out.println(f.apply(10));
		System.out.println(f.apply(25));
		System.out.println(f.apply(30));
		System.out.println(f.apply(23));
		System.out.println(f.apply(78));
		
	
		
		
		

	}

}
