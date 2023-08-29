package Streams_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_Ex3 {

	public static void main(String[] args) {
		List<Integer> number=Arrays.asList(2,3,4,5,6);
		
		
		/*for(int num:number) {
			System.out.println(num*3);
			
		}*/
			
		List<Integer> numlist=number.stream().map(n->n*3).collect(Collectors.toList());
		System.out.println(numlist);

	}

}
