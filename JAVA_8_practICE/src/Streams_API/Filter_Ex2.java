package Streams_API;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class Filter_Ex2 {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("vasu","naveen","varuntaj","jon","sansa","Daenerys");
		List<String>longnames= new ArrayList<String>();
		
		longnames=names.stream().filter(str->str.length()>3 && str.length()<5).collect(Collectors.toList());
		System.out.println(longnames);

	}

}
