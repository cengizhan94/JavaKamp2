package intro2;

public class Main {

			//Don't Repeat Yourself
	public static void main(String[] args) {
		/*
		 * String internetSubeButonu = "?nternet ?ubesine Giri?"; double dolarDun =
		 * 8.19; double dolarBugun = 8.19; int vade = 36; boolean dustuMu = false;
		 * 
		 * 
		 * System.out.println(internetSubeButonu);
		 * 
		 * if(dolarBugun<dolarDun) { System.out.println("Dolar d??t? img"); } else if
		 * (dolarBugun > dolarDun) { System.out.println("Dolar Y?kseldi img"); } else {
		 * System.out.println("Gri img G?ster"); }
		 * 
		 * String kredi1 = "H?zl? Kredi"; String kredi2 = "??renci Kredisi"; String
		 * kredi3 = "Evhan?m? Kredisi"; String kredi4 = "?ift?i Kredisi"; String kredi5
		 * = "MSB Kredisis";
		 * 
		 * System.out.println("kredi1");
		 * 
		 * System.out.println("Pratik yazma:");
		 * 
		 * System.out.println("**********");
		 * 
		 * 
		 * 
		 * String[] krediler = { "H?zl? Kredi", "??renci Kredisi", "Evhan?m? Kredisi",
		 * "?ift?i Kredisi", "MSB Kredisis", "K?lt?r Bakanl??? Kredisi" }; //foreach for
		 * (String kredi : krediler) { System.out.println(kredi); }
		 
			
			
			System.out.println("********");
			System.out.println("For i sayac?:");
			
			
			for(int i = 0; i<krediler.length; i++) {
				System.out.println(krediler[i]);
			}*/
			
			int sayi1 = 10;               //De?er tipler 'Stack' lenir ve birbirleri aras?nda ba? yoktur.
			int sayi2 = 20;  
			sayi1=sayi2;
			sayi2=100;
			System.out.println(sayi1);
			
			int[] sayilar1 = {1,2,3,4,5};   			//Array gibi referans tipler 'Heap' ile tutulur 
			int[] sayilar2 = {10,20,30,40,50};	//adres ile birbirine ba?lan?r.
			sayilar1=sayilar2;							//Dolay?s?yla sayilar1, say?lar2'nin adresini tuttu?undan,
			sayilar2[0] = 100;						//sayilar1[0]'da 100' oldu.
			System.out.println(sayilar1[0]);
			
			String sehir1 = "Ankara";				//String tipi istisnai olarak de?er tiplidir.
			String sehir2 = "?stanbul";				// Asl?nda Stringler birer 'Char' arrayidir.
			sehir1=sehir2;								// De?er tip olmas? istsinad?r.
			sehir2="?zmir";
			System.out.println(sehir1);			
			
	}
	

	

}
