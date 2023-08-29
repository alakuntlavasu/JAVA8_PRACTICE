package Predefin_Functional_interfaces;
import java.util.function.Predicate;
public class Predicate_Ex1 {

	public static void main(String[] args) {
		
	// predicate and integer type and p is refarance of predicate interface variable i is storead the given value
	// To invoke the Lambda Expression buy using test method 	
      Predicate<Integer> p=i->(i>10);
      System.out.println(p.test(20));
      System.out.println(p.test(5));
	}

}
