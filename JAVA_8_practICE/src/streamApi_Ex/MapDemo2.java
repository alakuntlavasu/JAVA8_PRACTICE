package streamApi_Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {

	public static void main(String[] args) {
		
		List<Integer>numberList=Arrays.asList(20,30,40,50,60);
		
		List<Integer>multiplidList=new ArrayList<Integer>();
		
		
		// before java 8 using for loop
		
		for(int num:numberList) {
			
//			System.out.println(num*3);
			multiplidList.add(num*3);
			
		}
		
		System.out.println(multiplidList);
		
		
	// 	using stream concept
	// Each and every object multiplied with and stored with sum other new collection 	
		
		multiplidList=numberList.stream().map(num->num*3).collect(Collectors.toList());
		System.out.println(multiplidList);
		
		
    // Each and every object multiplied and read the data 
	
		numberList.stream().map(num->num*3).forEach(num->System.out.println(num));
		
		                       // or
		
		numberList.stream().map(num->num*3).forEach(System.out::println);
		
	}

}
