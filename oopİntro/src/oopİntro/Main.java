package oop?ntro;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1,"Lenovo14", 3000,"M?kemmel Bilgisayar"); //?rnek olu?turma , intance, referans olu?turma denir.
		
		Product product4 = new Product(4,"Asus",4000,"On numara Bilgisayar"); 
	
		
		Product product3 = new Product(3,"Acer",1000,"Belediye'nin Da??tt??? bilgisayar"); 
		
		Product product2 = new Product(2,"MSI",5000,"GAMER Bilgisayar?"); 
	;
		
		Product[] products= {product1,product2,product3,product4};
		
		for (Product product : products) {
			System.out.println(product.name);
			System.out.println(product.detail);
			System.out.println(product.unitPrice);
			System.out.println(product.id);
		}
		
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.id=1;
		category1.name = "Bilgisayar";
		
		
		Category category2 = new Category();
		category2.id=2;
		category2.name = "Bah?e" ;
		

		
		ProductManager productManager = new ProductManager();
		
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		productManager.addToCart(product4);
	}

}
