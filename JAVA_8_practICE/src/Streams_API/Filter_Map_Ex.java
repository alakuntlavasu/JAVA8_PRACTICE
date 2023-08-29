package Streams_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employe{
	
	int empid;
	int empsal;
	String emname;
	
	public Employe(int empid,int empsal,String emname) {
		
		this.empid=empid;
		this.empsal=empsal;
		this.empid=empid;
	}
	
}
public class Filter_Map_Ex {

	public static void main(String[] args) {
		
    List<Employe> emplist=Arrays.asList(
    		                            new Employe(101,10000,"vasu"),
    		                            new Employe(101,20000,"vasu"),
    		                            new Employe(101,30000,"vasu"),
    		                            new Employe(101,40000,"vasu"),
    		                            new Employe(101,50000,"vasu")
    		                            
    		                            );
    
    // In this Employ list i want filter the greterthen twenty thousand
    
    // combination of filter and map
    
    List<Integer> empsal=emplist.stream().filter(e->e.empsal>20000)
    		                             .map(e->e.empsal)
    		                             .collect(Collectors.toList());
    System.out.println(empsal);
 
 
    
    
	}

}
