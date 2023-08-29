package Functional_interfaces;
@FunctionalInterface
interface displayable{
	public void display(String msg);
	
}

class Varun implements displayable{

	@Override
	public void display(String msg) {
		System.out.println(msg);
		
	}
	
}
public class Functional_interface_Ex3 {

	public static void main(String[] args) {
		
       Varun v1=new Varun();
       v1.display("Welcome to Alakuntla vasu");
	}

}
// What is @Functional Interface
// @Functional interface its allows single Abstract method 

// specific @Functional interface

