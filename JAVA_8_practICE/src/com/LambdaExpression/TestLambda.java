package com.LambdaExpression;

public class TestLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		String s = "Alakuntla vasu";

		// we can write a Lambda for an interface
		// Lambda name can be use anything

//		TestInterface ts= public Abstract  void add() {
//			
//			System.out.println("add using Lambda ");
//			
//		};
		
       // first interface
		TestInterface ts = () -> {System.out.println("Add using Lambda");};

		// second interface
		TestInterface1 tf = (int i)->{ int c=i*10 ;System.out.println(c);};
	

		ts.add();
//		tf.multiplay(100);
		tf.multiplay(50);
		tf.multiplay(10);

	}

}
