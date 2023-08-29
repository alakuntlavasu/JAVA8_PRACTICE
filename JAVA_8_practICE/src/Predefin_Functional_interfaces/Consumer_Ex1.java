package Predefin_Functional_interfaces;
import java.util.function.Consumer;
public class Consumer_Ex1 {

	public static void main(String[] args) {
		
    Consumer <String> c=s->System.out.println(s);
    c.accept("Alakuntla vasu");
	}

}
