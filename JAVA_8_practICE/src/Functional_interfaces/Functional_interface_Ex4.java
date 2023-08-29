package Functional_interfaces;

@FunctionalInterface
interface Cab5{       // When an interface will have Excatly 1 abstract method we can say it as functional Interface
	void bookCab();   
}
  class Uberx implements Cab5{

	public void bookCab() {
		System.out.println("Uberx Booked !! Arriving soon!!");
		
	}
	
}
public class Functional_interface_Ex4 {

	public static void main(String[] args) {
//		Cab5 c= new Uberx();
		Uberx v=new Uberx();
		v.bookCab();
		
		

	}

}
