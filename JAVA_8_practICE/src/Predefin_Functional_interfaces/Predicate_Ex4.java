package Predefin_Functional_interfaces;

class Employee{
	String ename;
	int salary;
	int Expreance;
	Employee(String ename,int salary,int exp){
		ename=ename;
		salary=salary;
		Expreance=exp;
	}
}
public class Predicate_Ex4 {

	public static void main(String[] args) {
		
     Employee e1=new Employee("vasu",50000,5);
     
//     Predicate<Employee> pr=e->(e.salary>30000 && e.Expreance>3);
//     System.out.println(pr.test(e1));
	}

}
