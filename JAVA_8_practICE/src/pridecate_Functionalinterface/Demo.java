package pridecate_Functionalinterface;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	String ename;
	int salary;
	int exprince;
	
	Employee(String ename,int sal,int exp){
		
		ename=ename;
		salary=sal;
		exprince=exp;
		
	}
}

public class Demo {
	

	public static void main(String[] args) {
		// Ex1
		Employee emp=new Employee("vasu",50000,5);
		
		
		
		// passing emp object----> and its sal>30000 and exp>3
		
		  Predicate<Employee> pr=e->(e.salary>30000 &&e.exprince>3);
		  
//		  System.out.println(pr.test(emp));
		  
		  
		//Ex2 
		  
		  ArrayList<Employee> al=new ArrayList<Employee>();
		  
		  al.add(new Employee("vasu",50000,5));
		  
		  al.add(new Employee("naveen",70000,25));
		  
		  al.add(new Employee("varun",60000,6));
		  
		  al.add(new Employee("jaggu",5000,5));
		  
		  al.add(new Employee("shafi",20000,5));
		  
		  al.add(new Employee("heamanth",50000,5));
		  
		  al.add(new Employee("modi",1600,16));
		  
		  al.add(new Employee("pavan",9000,7));
		  
		  al.add(new Employee("sukumar",150000,4));
		  
		  al.add(new Employee("sudarshan",10000,3));
		  
		  al.add(new Employee("imran",30000,15));
		  
		  for(Employee e:al) 
		  {
			  if(pr.test(e)) 
			  {
				
				  System.out.println(e.ename+"  "+e.salary);
			  }
			  
		  }
		
	

	}

}
