package streamApi_Ex;

import java.util.Arrays;
import java.util.List;

public class MapDemo1 {

	public static void main(String[] args) {
	
		List<String> student=Arrays.asList("varun","jaggu","shafi","hemanth","naveen");
		
	// before java8/without streams	
		
		for( String sname:student) {
			System.out.println(sname.length());
			
		}
		
		
	// student list each and every object or element find the length 
	// using streams concept
		
		student.stream().map(name->name.length()).forEach(slen->System.out.println(slen));
		
		//Other way
		
		
		student.stream().map(name->name.length()).forEach(System.out::println);
		
		
		
	
		
	}

}
