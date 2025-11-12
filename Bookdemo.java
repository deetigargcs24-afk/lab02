import java.util.Scanner;

// Class to store book details
class Book {
    String name;
    String author;
    double price;
    int numpages;

    // Constructor
    Book(String name, String author, double price, int numpages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numpages = numpages;
    }

    // Method to set details
    void setDetails(String name, String author, double price, int numpages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numpages = numpages;
    }

    // Method to display details
    void getDetails() {
        System.out.println("Book Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Number of pages: " + numpages);
    }

    // toString() method
    public String toString() {
        return "Book Name: " + name + ", Author: " + author + ", Price: " + price + ", Pages: " + numpages;
    }
}                          

// Main class
public class Bookdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter author: ");
            String author = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            System.out.print("Enter number of pages: ");
            int numpages = sc.nextInt();
            sc.nextLine(); // consume newline

            books[i] = new Book(name, author, price, numpages);
        }

        System.out.println("\n--- Book Details ---");
        for (int i = 0; i < n; i++) {
            System.out.println(books[i].toString());
        }

        sc.close();
    }
}
