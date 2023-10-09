package com.LambdaExpression;

interface Dao
{
	public void m1();
	}

class Test implements Dao{

	@Override
	public void m1() {
		System.out.println("Hello Alakuntla vasu");
		
	}

}
public class LamdaEx {

	public static void main(String[] args) {
		
		Dao t=new Test();
		t.m1();
		

	}

}
