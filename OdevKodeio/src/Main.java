
public class Main {

	public static void main(String[] args) {
		BookCase book3 = new BookCase(2021,"Cengiz","KayipruhlarAkademisi");
		
		BookCase book1 = new BookCase(2019,"Mehmet Yildiz","Hayal Hanem");
			
			
		BookCase book2 = new BookCase(2020,"Adem Gunes","Zirve");
			
			BookCase[] books = {
					book1,book2,book3
			};
			for (BookCase bookCase : books) {
				System.out.println(book1.theAuthor + " " + book1.publisherName);
				
			}
				BookCaseManager manager = new BookCaseManager();
				manager.addBook();
					
				
			
		
	
	}

}
