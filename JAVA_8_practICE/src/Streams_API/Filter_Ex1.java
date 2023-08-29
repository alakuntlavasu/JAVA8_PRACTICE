package Streams_API;

import java.util.*;
import java.util.stream.Collectors;

public class Filter_Ex1 {

	public static void main(String[] args) {
		
		
	// creating on ArrayList object	
		
  /* ArrayList<Integer> numlist= new ArrayList<Integer>();
   * 
   // adding sum elements
    * 
   numlist.add(10);
   numlist.add(15);
   numlist.add(25);
   numlist.add(30);
   numlist.add(35);
   numlist.add(40);
   numlist.add(45);*/
		
		
		// creating another way ArrayList by using Arrays class and asList method
		List<Integer> numlist=Arrays.asList(10,15,25,30,40);
//	
		// after processing data stored in given list
		List<Integer> evennum=new ArrayList<Integer>();
		
		// i want filter the even numbers?
		
		
		// 1 without using streams
		
		/*for( int n:numlist) {
			if(n%2==0)
				
				evennum.add(n);

		}
		System.out.println(evennum);*/
		
		
       //2 with Streams using Filter method
		
		/*evennum=numlist.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evennum);*/
		
		// 3 just print the value
		 
		numlist.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
	}
	

}
