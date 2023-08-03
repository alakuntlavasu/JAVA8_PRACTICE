package streamApi_Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {

  /* List<Integer>numberList= new ArrayList<Integer>();
		
      numberList.add(10);
      numberList.add(20);
      numberList.add(30);
      numberList.add(40);
      System.out.println(numberList);*/
		
		List<Integer>numberList=Arrays.asList(10,15,20,25,30);
		List<Integer>evennumberList=new ArrayList<Integer>();
		
		//**** without stream
		
		/*for(int n:numberList) {
			
			if(n%2==0)
			evennumberList.add(n);
			
			
		}
		System.out.println(evennumberList);*/
		
		//**** with stream
		
		/*evennumberList=numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		System.out.println(evennumberList);*/
		
		// using forEach (consumer) 
		// it will print the data that is called consumer but no returen value
		
//		numberList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		// Other way
		
		numberList.stream().filter(n->n%2==0).forEach(System.out::println);
		
	}

}
