package singleton;

public class DocumentManager {

	private static DocumentManager sharedInstance =null;
	private Carte book =null;
	private DocumentManager() {
		
	}
	public static DocumentManager getInstance() {
		if(sharedInstance == null) {
			sharedInstance = new DocumentManager();
		}
		return sharedInstance;
	}
	public void setBook(Carte newBook) {
		book= newBook;
	}
	public Carte getBook() {
		return book;
	}
}
