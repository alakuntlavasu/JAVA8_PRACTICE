package Stream_methods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {

	public static void main(String[] args) {
	
		
		List<String> stringList= Arrays.asList("vasu","jaggu","shafi","Hemanth");
		
		Optional<String> element=stringList.stream().findAny();
		
		System.out.println(element.get());

	}

}
