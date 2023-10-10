package streamApi_Ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sorted_Ex2 {

	public static void main(String[] args) {
	
		List<String> number= Arrays.asList("vasu","jaggu","shafi","Hemanth","varun","Naveen");
		
	// sorted 
	// natural or assinding order 	
		
		List<String>sortedList1=number.stream().sorted().collect(Collectors.toList());// out put = [Hemanth, Naveen, jaggu, shafi, varun, vasu]
		
		System.out.println(sortedList1);
		
		
		List<String>sortedList=number.stream().sorted().limit(3).collect(Collectors.toList());// out put =  [Hemanth, Naveen, jaggu]
		
		System.out.println(sortedList);
		
		List<String>sortedList2=number.stream().sorted().limit(3).skip(2).collect(Collectors.toList());// out put= [jaggu]
		
		System.out.println(sortedList2);
	}

}
