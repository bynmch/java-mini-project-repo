package bms.service;

import bms.repository.BookRepository;

public class BookService {

    private final BookRepository br;
    public BookService() {
        br = new BookRepository();
    }
}
