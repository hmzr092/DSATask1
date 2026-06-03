import java.util.*;
public class LibraryManager {
    private TreeSet<String> books;

    public LibraryManager() {
        this.books = new TreeSet<>();
    }

    public String addBook(String title, String author) {
        books.add("Title : " + title + " " + " Author : " + author);
        return "Book added";
    }

    public String removeBook(String title) {
        if (books.contains(title)) {
            books.remove(title);
            return "Book removed";
        }
        return "Book doesn't exist";
    }

    public void isAvailable(String title) {
        if (books.contains(title)) {
            System.out.println("Book available");

        }
        else{
            System.out.println("Book isn't available");
        }
    }
    public void displayAllBooks(){
        for(String book : books){
            System.out.println(book);
        }
    }
}
