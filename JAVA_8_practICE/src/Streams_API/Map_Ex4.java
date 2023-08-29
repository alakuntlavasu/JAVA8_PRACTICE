package Streams_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_Ex4 {

	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(45,10,4,23);
		
		
		List<Integer> numlist=num.stream().map(n->n+3).collect(Collectors.toList());
		System.out.println(numlist);
		
	}

}
