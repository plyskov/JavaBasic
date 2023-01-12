package lesson4;

import lesson4.entity.Book;
import lesson4.services.BookUtil;
import lesson4.services.UserInput;

public class ApplicationLibrary {
    public static void main(String[] args) {

        // Create book
        // read book info
        // edit book

        // --------- создать экземпляры рабочих классов --------
        BookUtil bookUtil = new BookUtil();
        UserInput userInput = new UserInput();

        // -----------------------------------------------------

        Book ourFirstBook = bookUtil.createBook();

        System.out.println(ourFirstBook);
        System.out.println("---------------------");

        ourFirstBook.setAuthor("Cooper");
        ourFirstBook.setName("Last Mogikhan");
        ourFirstBook.setCatacogNumber("123-654-888");
        ourFirstBook.setPages(257);
        ourFirstBook.setInStorage(true);

        System.out.println(ourFirstBook);

        // ---- еще одна книга
        Book ourSecondBook = bookUtil.createBookWitthAuthorAndName("Vern", "Deti");
        ourSecondBook.setPages(340);
        ourSecondBook.setCatacogNumber("123-ABC-456");
        ourSecondBook.setInStorage(true);

        System.out.println(ourSecondBook);

        Book ourThirdBook = bookUtil.createBookWithAllParameters(
                "Tven",
                "Tom Soyer",
                367,
                "987-654-321",
                true);
        System.out.println(ourThirdBook);

        String newAuthor = userInput.stringInput("Please enter new book author");
        String newBookName = userInput.stringInput("Please enter new book name");
        int newBookPages = userInput.integerInput("Please enter new book pages");
        String newBookCatalogNumber = userInput.stringInput("Please enter new book catalog name");
        boolean newBookIsPresent = userInput.booleanInput("Is book in the storage?");

        Book ourNextBook = bookUtil.createBookWithAllParameters(newAuthor,
                newBookName,
                newBookPages,
                newBookCatalogNumber,
                newBookIsPresent);
        System.out.println(ourNextBook);

        bookUtil.editBookCatalogNumber(ourThirdBook, "123-ABC-631");
        System.out.println(ourThirdBook);

    }
}
