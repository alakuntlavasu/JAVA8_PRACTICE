package Streams_API;
import java.util.*;


class Product{
	int id;
	String name;
	double price;
	public Product(int id,String name,double price) {
		this.id=id;
		this.name=name;
		this.price=price;
				
	}
}
public class Filter_Ex4 {

	public static void main(String[] args) {
		
      List<Product>productList=new ArrayList<Product>();
      productList.add(new Product(1,"Hp Laptop",25000));
      productList.add(new Product(1,"Lenovo Laptop",30000));
      productList.add(new Product(1,"Dell Laptop",28000));
      productList.add(new Product(1,"Apple Laptop",23000));
      productList.add(new Product(1,"Mack Laptop",90000));

      // i want filter the objects from this collections based on price off the product
      
      productList.stream().filter(p->p.price>25000)
                           .forEach(pr->System.out.println(pr.price));
	}

}
