package streamApi_Ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx {

	public static void main(String[] args) {
	
		
		List<Integer> List1=Arrays.asList(1,2,3,4);
		List<Integer> List2=Arrays.asList(5,6,7,8);
		List<Integer> List3=Arrays.asList(9,10,11,12);
		
		List<List<Integer>> finallist= Arrays.asList(List1,List2,List3);
		
		List<Integer> finallists= finallist.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		
		System.out.println(finallists);

	}

}
