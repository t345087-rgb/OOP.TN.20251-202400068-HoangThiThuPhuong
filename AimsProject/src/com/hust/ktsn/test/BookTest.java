package com.hust.ktsn.test;
import com.hust.kstn.models.Book;
import com.hust.kstn.models.BookAuthor;
public class BookTest {

	public static void main(String[] args) {
		Book book = new Book("Alibaba", "Novel", 12.5, 5);

        BookAuthor author1 = new BookAuthor("ABC", 1896, "HoangPhucThinh");
        BookAuthor author2 = new BookAuthor("XYZ", 1975, "NguyenThiHang");

        book.addAuthor(author1);
        book.addAuthor(author2);

        System.out.println(book);

        System.out.println("...Removing 1 author...");
        book.removeAuthor(author2);

        System.out.println(book);
	}
}
