
import java.util.Arrays;
import java.util.Scanner;


public class BookStoreApp {
	public static void main(String[] args) {

		BookStore bookStore = new BookStore();
		Scanner sc = new Scanner(System.in);
		
		while (true) {

			System.out.println("Enter “1”, to display the Books.");
			System.out.println("Enter “2”, to order new books.");
			System.out.println("Enter “3”, to sell books.");
			System.out.println("Enter “0”, to exit the system.");
			String ISBN,bookTitle;
			int noOfCopies;

			
			int option = sc.nextInt();

			switch (option) {
			case 1:
				bookStore.display();
				break;
			case 2:
				System.out.println("Book ISBN & no of copies pls..");
				sc.nextLine();
				ISBN = sc.nextLine();
				noOfCopies = sc.nextInt();
				//noOfCopies = 1;
				bookStore.order(ISBN, noOfCopies);
				break;
			case 3:
				System.out.println("Book Title & no of copies pls..");
				sc.nextLine();
				bookTitle = sc.nextLine();
				noOfCopies = sc.nextInt();
				//noOfCopies = 1;				
				bookStore.sell(bookTitle, noOfCopies);
				break;
			case 0:
				break;

			default:
				System.out.println("Pls enter a valid option..");
			}

			if (option == 0)
				break;

		}
	}
}

class BookStore {
	Book[] books = new Book[10];
		

	void sell(String bookTitle, int noOfCopies) {		
		boolean flag = true;
		for (Book book : books) {
			if (book != null && book.getBookTitle().equals(bookTitle)) {
				book.setNumOfCopies(Math.max(0, book.getNumOfCopies() - noOfCopies));
				flag = false;
				break;
			}
		}

		if (flag)
			System.out.println("Book not found");

	}

	void order(String ISBN, int noOfCopies) {
		for (Book book : books) {
			if (book != null  && book.getISBN().equals(ISBN)) {
				book.setNumOfCopies(book.getNumOfCopies() + noOfCopies);
				break;
			}
			 else if (book == null) {
					Scanner sc = new Scanner(System.in);
					System.out.println("not found.");
					System.out.print("Enter book title: ");
					String bookTitle = sc.nextLine();
					System.out.print("Enter book author: ");
					String author = sc.nextLine();
					books[Arrays.asList(books).indexOf(book)] = new Book(bookTitle, author, ISBN, noOfCopies);
					break;
		}

		
	}
	}

	void display() {
		for (Book book : books) {
			if(book != null)
			book.display();
		}
	}

}

class Book {

	private String bookTitle;
	private String author;
	private String ISBN;
	private int numOfCopies;

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}

	public Book(String bookTitle, String author, String ISBN, int numOfCopies) {
		this.bookTitle = bookTitle;
		this.author = author;
		this.ISBN = ISBN;
		this.numOfCopies = numOfCopies;
	}

	void display() {
		System.out.println(bookTitle + " " + author + " " + ISBN + " " + numOfCopies);
		
	}


}
