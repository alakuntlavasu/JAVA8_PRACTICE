package OptionalClass;

import java.util.Optional;

public class OptionalInterviwQ {

	public static void main(String[] args) {
		 
		String str=null;
		
		Optional<String> optional= Optional.ofNullable(str);
		
		{
			
			System.out.println(optional);
			
			
//			if(optional.isPresent()) {
//				System.out.println(optional.get());
//			}
//			else {
//				System.out.println("value is not present");
//			}
//			optional.ifPresent(s->System.out.println(s));
			
		}
	}
		
}

	


