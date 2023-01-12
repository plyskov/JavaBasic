package lesson4.services;

import lesson4.entity.Book;

public class BookUtil {

    public Book createBook(){
        Book newBook = new Book();
        return newBook;
    }

    public Book createBookWitthAuthorAndName(String author, String name){
        Book newBook = new Book(author, name);
        return newBook;
    }

    public Book createBookWithAllParameters(String author, String name, int pages, String catacogNumber, boolean isInStorage){
        Book newBook = new Book(author, name, pages, catacogNumber, isInStorage);
        return newBook;
    }

    public void editBookCatalogNumber(Book ourBook, String newCatalogNumber){
        ourBook.setCatacogNumber(newCatalogNumber);
    }

}
