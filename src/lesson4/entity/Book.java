package lesson4.entity;

public class Book {

    private String author;
    private String name;
    private int pages;
    private String catacogNumber;
    private boolean isInStorage;

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getCatacogNumber() {
        return catacogNumber;
    }

    public void setCatacogNumber(String catacogNumber) {
        this.catacogNumber = catacogNumber;
    }

    public boolean isInStorage() {
        return isInStorage;
    }

    public void setInStorage(boolean inStorage) {
        isInStorage = inStorage;
    }

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }

    public Book(String author, String name, int pages, String catacogNumber, boolean isInStorage) {
        this.author = author;
        this.name = name;
        this.pages = pages;
        this.catacogNumber = catacogNumber;
        this.isInStorage = isInStorage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                ", catacogNumber='" + catacogNumber + '\'' +
                ", isInStorage=" + isInStorage +
                '}';
    }
}
