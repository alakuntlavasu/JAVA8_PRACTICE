package com.LambdaExpression;

public class Testimpl implements TestInterface {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
		System.out.println("add");
		
	}
	
	public static void main(String[] args) {
		
		Testimpl td=new Testimpl();
		td.add();
	}

}
