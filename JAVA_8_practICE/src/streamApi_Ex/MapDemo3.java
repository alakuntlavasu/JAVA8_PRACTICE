package streamApi_Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {

	public static void main(String[] args) {
	
		
//		List<String> slist= new ArrayList<>();
		List<String> slist=  Arrays.asList("vasu","naveen");
		List<String> list= new ArrayList<>();
		
//		for(String s:slist) 
//		{
//			list.add(s.toUpperCase());
//			
//		}
//		
//		System.out.println(list);
		
		
		list=slist.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		 
		System.out.println(list);
	}

}
