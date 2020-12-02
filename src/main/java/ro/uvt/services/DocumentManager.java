package ro.uvt.services;

import ro.uvt.models.Book;

public class DocumentManager {
    static private DocumentManager instance = null;
    private Book book = new Book(" ");

    private DocumentManager() {
        if (instance == null) {
            instance = new DocumentManager();
        }
    }

    public static DocumentManager getInstance() {
        return instance;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
