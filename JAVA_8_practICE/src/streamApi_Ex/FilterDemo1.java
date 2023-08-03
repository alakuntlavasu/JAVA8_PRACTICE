package streamApi_Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {

	public static void main(String[] args) {
		
		List<String>names=Arrays.asList("Alakuntla","vasu","varunK","Rajeshm");
		List<String>Fullnames=new ArrayList<String>();
		
		Fullnames =names.stream().filter(str->str.length()>6 && str.length()<8).collect(Collectors.toList());
		
		System.out.println(Fullnames);

	}

}
