package Functional_interfaces;

interface Cab7{
	void bookedCab();
}

/*class Demo implements Cab7{

	@Override
	public void bookedCab() {
		System.out.println("cab is booked");
		
	}
	
}*/

public class Lambda_Ex1 {

	public static void main(String[] args) {
		
		
		// Lambda Expression
		Cab7 c1=()->{System.out.println("Ubrex Booked !! Arriving  test soon !!");
			
			
		};
		c1.bookedCab();
		

	}

}

// 1 what is Lambda Expression ?
// no method name and no returen type no access modifires that is called Lambda Expression

// 2 what is use of Lambda Expression ?
// code reasuble or consize the code 
// to readuce the code 
// Lambda Expression they are going to work with Functional Expression ondly