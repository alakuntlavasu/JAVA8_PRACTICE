package Functional_interfaces;


interface Vasu{
	public int m1(int a,int b);
	
	
}
 class Test implements Vasu{

	@Override
	public int m1(int a, int b) {
		System.out.println(a+b);
		return a+b;
	}
	
	
}

public class Functional_interface_Ex2 {

	public static void main(String[] args) {
		
     Test t1= new Test();
     t1.m1(10, 20);
	}

}
