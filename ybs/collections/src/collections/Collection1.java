package collections;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	
	 int pid;
	 String pname;
	 float price;
	public Product(int pid, String pname, float price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	
	
}

public class Collection1 {

	public static void main(String[] args) {
		
		List<Product> pList = new ArrayList<Product>();
		
		pList.add(new Product(1,"HP Laptop",25000f)); 
		pList.add(new Product(2,"Dell Laptop",35000f));  
		pList.add(new Product(3,"Lenova Laptop",45000f));  
		pList.add(new Product(4,"Acer Laptop",55000f));  
		pList.add(new Product(5,"Apple Laptop",65000f));  
		
		List<Product> priceList = pList.stream().filter(x->x.price>35000)
		.collect(Collectors.toList());
		//.map(pm->pm.price);
		//.forEach(System.out::println);
		
		//System.out.println(priceList);
		
		  for (Product product : priceList) {
			  System.out.println(product);
		  
		  }
		 
		
		
	}

}
