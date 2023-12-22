package com.StringJoiner;

import java.util.StringJoiner;

public class DemoString_Joiner {

	public static void main(String[] args) {
		
		StringJoiner stringjoin=new StringJoiner("   ~|*|~   ");
		
		stringjoin.add("madanapalli");
		stringjoin.add("Bangalore");
		stringjoin.add("Telangana");
		stringjoin.add("Tirupathi");
		stringjoin.add("chittoor");
		
		System.out.println(stringjoin);

	}

}
