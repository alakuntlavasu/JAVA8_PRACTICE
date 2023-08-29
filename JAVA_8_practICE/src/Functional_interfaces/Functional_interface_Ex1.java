package Functional_interfaces;


interface Cab{
	void bookcab();
}

 class Ola implements Cab{

	@Override
	public void bookcab() {
		System.out.println("Ola cab is bookes....");
		
	}
	 
 }

public class Functional_interface_Ex1 {

	public static void main(String[] args) {
		
        Ola cab =new Ola();
        cab.bookcab();
	}

}

// 1 what is Functional Interface?

//  Functional Interface is an interface that contains exactly one abstract method
