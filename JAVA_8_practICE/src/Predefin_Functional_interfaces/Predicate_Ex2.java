package Predefin_Functional_interfaces;

import java.util.function.Predicate;
public class Predicate_Ex2 {

	public static void main(String[] args) {
		
		// I want check the length of given String is greater then 4 or not
		Predicate <String>pr=s->(s.length()>4);
		System.out.println(pr.test("Alakuntlavasu"));
		System.out.println(pr.test("Taj"));
	}

}
// preadicate is one parameter passing