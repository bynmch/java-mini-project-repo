package bms.aggregate;

public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private BookCategories category;
    private long isbn;
    private BookStatus status;

    public Book() {
    }

    //데이터 삽입할 때 필요한 객체 생성을 위한 생성자
    public Book(String title, String author, String publisher, BookCategories category, long isbn) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
        this.isbn = isbn;
    }

    public Book(int id, String title, String author, String publisher, BookCategories category, long isbn, BookStatus status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
        this.isbn = isbn;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public BookCategories getCategory() {
        return category;
    }

    public void setCategory(BookCategories category) {
        this.category = category;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", category=" + category +
                ", isbn=" + isbn +
                ", status=" + status +
                '}';
    }
}
