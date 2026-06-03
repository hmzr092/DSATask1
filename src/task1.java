
public class task1 {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();
        //Adding books in library
        System.out.println("Adding books in library:");
        manager.addBook("Mein Kampf", "Hitler");
        manager.addBook("A Tale of Two Cities", "Charles Dickens");
        manager.addBook("1984", "George Orwell");
        manager.displayAllBooks();

        //Removing book in library
        manager.removeBook("Mein Kampf");

        //Book Availability
        System.out.println("Book availability status:");
        manager.isAvailable("Mein Kampf");

        //Display books
        manager.displayAllBooks();


    }
}
