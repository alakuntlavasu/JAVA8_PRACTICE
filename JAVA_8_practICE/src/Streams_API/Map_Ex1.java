package Streams_API;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;
public class Map_Ex1 {

	public static void main(String[] args) {
		
    List<String> empnames=Arrays.asList("vasu","naveen","varuntaj","suhasini");
//  List<String>emplist=new ArrayList();
    
    // 1 without using streams
    
   /* for(String name:empnames) {
    	emplist.add(name.toUpperCase());
    }
    System.out.println(emplist);*/
    
    //2 stream - map
    
    
   // map will take consumer is a parameter and do sum operation and collecting another list
  List <String>m1 =empnames.stream().map(v->v.toUpperCase()).collect(Collectors.toList());
    
    System.out.println(m1);
    
	}

}
