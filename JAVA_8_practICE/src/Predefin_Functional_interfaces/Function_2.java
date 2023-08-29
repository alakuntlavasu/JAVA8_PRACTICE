package Predefin_Functional_interfaces;

import java.util.function.Function;

public class Function_2 {

	public static void main(String[] args) {
     
	//	When i pass string has argument and it will be return the integer out put 
        Function<String,Integer> fn=s->s.length();
        
        System.out.println(fn.apply("Alakuntlavasu"));
        System.out.println(fn.apply("varuntaj"));
        System.out.println(fn.apply("AlakuntlaNaveen"));

	}

}
