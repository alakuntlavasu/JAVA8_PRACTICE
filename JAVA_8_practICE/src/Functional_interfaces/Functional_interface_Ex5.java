package Functional_interfaces;

interface Cab6{
	void bookedCab();
}
public class Functional_interface_Ex5 {

	public static void main(String[] args) {
		
		
		// Anonymous class Impiementation
		
		Cab6 cab=new Cab6() {

			@Override
			public void bookedCab() {
				System.out.println("Uberx Booked !! Arriving soon!!");
				System.out.println("*************");
			}
			
	};
		
      cab.bookedCab();
      
      
      
	}

}
