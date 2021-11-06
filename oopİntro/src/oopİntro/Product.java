package oop›ntro;

public class Product {
	public Product() {  //<< Constructor Block
		System.out.println("Ben «al˝˛t˝m");
	}
	
	public Product(int id, String name, double unitprice, String detail	) {
		this();
		this.id = id;
		this.name = name;
		this.unitPrice= unitprice;
		this.detail = detail;
	}
	
	
	
	int id;	
	String name;
	double unitPrice;
	String detail;
	
}
