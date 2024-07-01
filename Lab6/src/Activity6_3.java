import java.util.Stack;

public class Activity6_3 {
    public static void main(String[] args) {
        Stack<Book> books = new Stack<>();
        books.push(new Book("1234", "JJ", "Fundamental of Java"));
        books.push(new Book("3456", "KK", "Fundamental of Kotlin"));
        books.push(new Book("5678", "PP", "Fundamental of Python"));

        // Display the content of stack books using books.forEach(e->System.out.println(e))
        books.forEach(e->System.out.println(e));

        // 2nd Stack called booksReversed to hold Book objects
        Stack<Book> booksReversed = new Stack<>();

        // Construct a loop to pop() the topmost element from books, and push() it to booksReversed until books is empty
        while (!books.isEmpty()) {
            booksReversed.push(books.pop());
        }

        // Display the content of stack books
        booksReversed.forEach(e->System.out.println(e));

    }

    
}

class Book {
    String ISBN, author, title;
    // Public constructor for Book class
    public Book(String ISBN, String author, String title) {
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
    }

    @Override
    // To print the Book information in the specified format
    public String toString() {
        return this.ISBN + "-" + this.title + "-" + this.author;
    }
}

