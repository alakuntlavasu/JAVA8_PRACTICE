package Functional_interfaces;

interface Cab9{
	public String bookeCab(String source,String destination);
	
}
/*class Ola5 implements Cab9{

	
	public String bookeCab(String source, String destination) {
		System.out.println("Ola cab is booked from"+source+"To"+destination);
		return ("price:6000 Rs");
	}
	
}*/
public class Lambda_Ex3 {

	public static void main(String[] args) {
		
		// Lambda Expression
          Cab9 cab=( source, destination)->{System.out.println("Ola cab is booked from"+source+"To"+destination);
  		return ("price:7000 Rs");
  		};
//          cab.bookeCab("Madanapalli", "Tirupathi);
          System.out.println(cab.bookeCab("Madanapalli","Tirupathi"));
	}
	

}
