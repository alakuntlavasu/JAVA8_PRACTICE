package com.LambdaExpression;

interface vasu
{
	public void wish(); 
	
	}

public class LambdaEx1 {

	public static void main(String[] args) {
		
		vasu v=()->{System.out.println("Happy day");};
		v.wish();
	

	}

}
