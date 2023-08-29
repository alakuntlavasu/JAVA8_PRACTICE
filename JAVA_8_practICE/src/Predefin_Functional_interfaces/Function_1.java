package Predefin_Functional_interfaces;

import java.util.function.Function;

public class Function_1 {

	public static void main(String[] args) {
		
	// functional interface passing two arguments integer type and f is reference type n is variable n*n is do an action and return value   
		Function <Integer,Integer> f=n->n*n;
         System.out.println(f.apply(3));
         System.out.println(f.apply(5));
         System.out.println(f.apply(10));
         System.out.println(f.apply(500));
	}

}
