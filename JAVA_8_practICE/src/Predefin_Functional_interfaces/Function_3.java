package Predefin_Functional_interfaces;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.*;
class Employees{
	String ename;
	int salary;
	
	Employees(String ename,int salary){
		this.ename=ename;
		this.salary=salary;
	}
}
public class Function_3 {

	public static void main(String[] args) {
		ArrayList <Employees> emplist=new ArrayList<Employees>();
		
       // i want calculate bonus of the  all employee objects 
		
		emplist.add(new Employees("vasu",50000));
		emplist.add(new Employees("varun",30000));
		emplist.add(new Employees("naveen",20000));
		
		
	// 	passing the first argument is Employee object and return the integer value i.e bonus
		Function<Employees,Integer> f1=e->{
			
			int sal=e.salary;
			if(sal>=10000 && sal<=20000)
				return (sal *10/100);
			else if(sal>20000 && sal<=30000)
				return(sal *20/100);
			else if(sal>20000 && sal<=50000)
				return(sal *30/100);
			else
				return(sal*40/100);
		};
		
	Predicate<Integer> p=b->b>5000;	
		
		for(Employees emp:emplist) {
			int bonus=f1.apply(emp);
			
			if(p.test(bonus)) {
			System.out.println(emp.ename+" "+emp.salary);
			System.out.println("Bonus is:"+bonus);
		}
	}

}
}