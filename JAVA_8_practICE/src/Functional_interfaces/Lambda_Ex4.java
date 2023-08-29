package Functional_interfaces;

@FunctionalInterface
interface TestI{
	void m1();
	default void m2() {
		System.out.println("Well come to vasu");
	}
}
public class Lambda_Ex4 {
	
	public static void main(String[] args) {
		
	TestI t1 = ()->{
		System.out.println("Hello Alakuntla vasu");
	};
	t1.m1();
	t1.m2();
		
	}

}
