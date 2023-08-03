package streamApi_Ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
	

	public static void main(String[] args) {
		
		
	// In this List have we can filter the null values 	
     List<String>names=Arrays.asList("vasu",null,"varun","Rajesh",null,"madhu",null,null,"soniya");
     
     List<String> nameList=names.stream().filter(name->name!=null).collect(Collectors.toList());
     
     System.out.println(nameList);

	}

}
