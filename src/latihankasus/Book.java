package latihankasus;

public class Book extends Library {
    private String title;
    private String author;
    private String description; // Deskripsi buku
    private double price; // Harga buku
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author, String description, double price) {
        super(NamaPerpustakaan,AlamatPerpustakaan,DeskripsiPerpustakaan);
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isAvailable = true; // Default: Book is available when created
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Getter for availability
    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter to change availability
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
}
