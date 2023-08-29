package Predefin_Functional_interfaces;
import java.util.function.Predicate;
public class Predicate_Ex3 {

	public static void main(String[] args) {
		
      Predicate <String> pr =s->(s.length()>4);
      // print the Array elements whose size is >4 from given Array
      String names[]= {"vasu","varuntaj","naveen","Mary"};
      for(String name:names) {
    	  if(pr.test(name)) {
    		  System.out.println(name);
      }
	}

	}
}