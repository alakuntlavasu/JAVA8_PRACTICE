package streamApi_Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapEx_And_FilterEx {
	
	int emid;
	String emname;
	int emsal;
	
	
	

	public MapEx_And_FilterEx(int emid, String emname, int emsal) {
		super();
		this.emid = emid;
		this.emname = emname;
		this.emsal = emsal;
	}




	@Override
	public String toString() {
		return "MapEx_And_FilterEx [emid=" + emid + ", emname=" + emname + ", emsal=" + emsal + "]";
	}




	public static void main(String[] args) {
	
//		List<MapEx_And_FilterEx> emplist= Arrays.asList(
//				new MapEx_And_FilterEx(101,"vasu",38000) );
//				new MapEx_And_FilterEx(102,"varun",65000) ;
//				new MapEx_And_FilterEx(103,"Rajesh",28000) ;
//				new MapEx_And_FilterEx(104,"Naveen",22000) ;
//				new MapEx_And_FilterEx(105,"Siva",52000) ;
//				new MapEx_And_FilterEx(106,"vamsi",15000) ;
//				new MapEx_And_FilterEx(107,"kotireddy",37000) ;
//				new MapEx_And_FilterEx(108,"jagadeesh",55000) ;
//				new MapEx_And_FilterEx(109,"shafi",25000) ;
//				new MapEx_And_FilterEx(111,"Hemanth",35000) ;
//				new MapEx_And_FilterEx(112,"pavan",28000) ;
//				new MapEx_And_FilterEx(115,"sukumar",34000) ;
		
		
		List<MapEx_And_FilterEx> emplist=new ArrayList<>();
		
		emplist.add(new MapEx_And_FilterEx(101, "vasu", 38000));
		emplist.add(new MapEx_And_FilterEx(102,"varun",65000)) ;
		emplist.add(new MapEx_And_FilterEx(103,"Rajesh",28000)) ;
		emplist.add(new MapEx_And_FilterEx(104,"Naveen",22000) );
		emplist.add(new MapEx_And_FilterEx(105,"Siva",52000)) ;
		emplist.add(new MapEx_And_FilterEx(106,"vamsi",15000)) ;
		emplist.add(new MapEx_And_FilterEx(107,"kotireddy",37000)) ;
		emplist.add(new MapEx_And_FilterEx(108,"jagadeesh",55000)) ;
		emplist.add(new MapEx_And_FilterEx(109,"shafi",25000)) ;
		emplist.add(new MapEx_And_FilterEx(111,"Hemanth",35000)) ;
		emplist.add(new MapEx_And_FilterEx(112,"pavan",28000)) ;
		emplist.add(new MapEx_And_FilterEx(115,"sukumar",34000)) ;

				
//				System.out.println(emplist);
				
				
				List<MapEx_And_FilterEx> empsalList= emplist.stream().filter(e->e.emsal>35000)
						                                    		.map(e->e)
						                                    		.collect(Collectors.toList());
														System.out.println(empsalList);
//			 emplist.stream().filter(e->e.emsal>35000).forEach(t->System.out.println(t));
				System.out.println(empsalList);
				                
	}

}
