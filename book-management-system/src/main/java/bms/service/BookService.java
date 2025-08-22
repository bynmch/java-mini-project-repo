package bms.service;

import bms.aggregate.Book;
import bms.repository.BookRepository;

import java.util.ArrayList;

public class BookService {

    private final BookRepository br;
    public BookService() {
        br = new BookRepository();
    }

    public void selectAllBooks() {

        ArrayList<Book> result = br.selectAllBooks();
        br.selectAllBooks();
        if(!result.isEmpty()){
            System.out.println("모든 도서 조회 ");
            for(Book book : result){
                System.out.println(book);
            }
        } else {
            System.out.println("도서가 없습니다. 도서를 추가해 주세요.");
        }
    }
}
