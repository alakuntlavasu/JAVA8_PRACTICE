package Streams_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_Ex2 {

	public static void main(String[] args) {
		List<String> vehicles=Arrays.asList("car","train","bicycle","flight");
		
		
		// 1 without stream
		// In this given list each element i want find the length using for loop
		
		/*for(String name:vehicles) {
			System.out.println(name.length());
		}*/
		
		// 2 with stream
		//In this given list each element i want find the length using map
		
		/*List velist=vehicles.stream().map(vname->vname.length()).collect(Collectors.toList());
		
		System.out.println(velist);*/
		
		// 3 using forEachmethod 
	}

}
