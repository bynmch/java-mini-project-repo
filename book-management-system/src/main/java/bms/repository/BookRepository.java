package bms.repository;

import bms.aggregate.Book;
import bms.aggregate.BookCategories;
import bms.aggregate.BookStatus;

import java.io.*;
import java.lang.reflect.Member;
import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> bookArrayList = new ArrayList<>();
    private File file = new File("src/main/java/bms/db/books.txt");

    public BookRepository() {

        if(!file.exists()) {
            ArrayList<Book> dummyBookList = new ArrayList<>();
            dummyBookList.add(new Book(1,"시대예보: 호명사회", "송길영", "교보문고", BookCategories.SOCIAL_SCIENCES, 9791170611875L, BookStatus.RETAINING));
            dummyBookList.add(new Book(2,"시대예보: 핵개인의 시대", "송길영", "교보문고", BookCategories.SOCIAL_SCIENCES, 9791170610359L, BookStatus.RETAINING));
            dummyBookList.add(new Book(3,"반도체 제조기술의 이해", "곽노열", "한올출판사", BookCategories.TECHNOLOGY, 9791166470677L, BookStatus.CHECK_OUT));

            ObjectOutputStream oos = null;
            try {
                oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                for (Book book : dummyBookList) {
                    oos.writeObject(book);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    if(oos != null) oos.close();    //NPE(NullPointerException)방지
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
