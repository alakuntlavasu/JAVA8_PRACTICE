package Predefin_Functional_interfaces;
import java.util.function.Predicate;
public class Predicate_Ex5 {

	public static void main(String[] args) {
		
   int a[]= {5,15,20,25,30,35,40,45,50,55,60,65};
   
   Predicate<Integer>p1=i->i%2==0;
   Predicate<Integer>p2=i->i>50;
   
   for(int n:a) {
	   if(p1.and(p2).test(n)){
		   System.out.println(n);
		   
	   }
   }
	}

}
