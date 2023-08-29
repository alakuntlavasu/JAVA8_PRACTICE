package Functional_interfaces;

interface Cab8{
	
	void bookCab(String source, String destination);
}
public class Lambda_Ex2 {

	public static void main(String[] args) {
		
		Cab8 cab= (source,destination)->System.out.println("Ubrex Booked from "+source+" to "+destination+"!! Arriving soon !!");
          cab.bookCab("Bangalure", "Madanapalli");
	}
	 
}
