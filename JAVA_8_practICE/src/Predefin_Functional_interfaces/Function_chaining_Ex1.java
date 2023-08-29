package Predefin_Functional_interfaces;

import java.util.function.Function;

public class Function_chaining_Ex1 {

	public static void main(String[] args) {
		
   Function<Integer,Integer> f1=n->n*2;
   Function<Integer,Integer> f2=n->n*n*n;
   
   System.out.println(f1.andThen(f2).apply(2));
   
   
   System.out.println(f1.compose(f2).apply(2));
	}

}
//1 what is function chaining
//* combining the function or function chaining
// to combining the two function that is called function chaining
// function chaining has two methods
//* andThen
//*compose
// 2 what is andThen?
// * Then pass apply value 2 this value f1 and whatever result  the same result pass into f2
// * first f1 will be execute whenever result passing f2 after return output

// 3 what is compose?
// *In this compose first it will be exicute f2 and then out put will be again send to f2