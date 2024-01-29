package Streams_API;

import java.util.ArrayList;
import java.util.List;

public class Filter_Ex6 {

	public static void main(String[] args) {
		
List<String> names= new ArrayList<>();
		
		names.add("c");
		names.add("a");
		names.add("b");
		names.add("c");
		names.add(null);
		
		System.out.println(names);
		
		names.stream().distinct().filter(n->n!=null).map(y->y.toUpperCase()).sorted().forEach(n->{System.out.println(n);});

	}

}
