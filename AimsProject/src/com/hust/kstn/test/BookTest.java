package com.hust.kstn.test;

import com.hust.kstn.models.Book;
import com.hust.kstn.models.BookAuthor;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        BookAuthor ba1 = new BookAuthor("Nguyen Nhat", 1910, "Sciencetist");
        BookAuthor ba2 = new BookAuthor("Nguyen Nhi", 1920, "Sciencetist");
        System.out.print(ba1.toString());
        System.out.println();

        List<BookAuthor> bookAuthors = new ArrayList<>();
        bookAuthors.add(ba1);
        bookAuthors.add(ba2);

        Book book = new Book("10 van cau hoi vi sao", 10.0, "Science",
                bookAuthors, 100);
        System.out.print(book.toString());
    }
}
