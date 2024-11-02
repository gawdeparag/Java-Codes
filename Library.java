import java.util.ArrayList;
import java.util.List;

// Example of Inner Class
public class Library {
    private String libraryName;
    private List<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Does not have a "static" keyword
    // Requires an outer class instance
    // It depends on an outer class instance
    // Tightly coupled with outer class instance data
    public class Book {
        private String title;
        private String author;
        private boolean isAvailable;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
            this.isAvailable = true;
            books.add(this);
        }

        public void borrowBook() {
            if (isAvailable) {
                isAvailable = false;
                System.out.println(title + " has been borrowed");
            } else {
                System.out.println(title + " is currently unavailable.");
            }
        }

        public void returnBook() {
            isAvailable = true;
            System.out.println(title + " has been returned");
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", isAvailable=" + isAvailable +
                    '}';
        }
    }

    public void displayBooks() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Books available: ");
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public static void main(String[] args) {
        Library library = new Library("My Library");

        Library.Book book1 = library.new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Library.Book book2 = library.new Book("1984", "George Orwell");

        library.displayBooks();
        System.out.println("-------------------");
        book1.borrowBook();
        book1.borrowBook();
        book1.returnBook();
        System.out.println("-------------------");
        library.displayBooks();
    }

}
