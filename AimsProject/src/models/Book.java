package com.hust.kstn.models;
import java.util.ArrayList;
import java.util.List;
public class Book extends Media {
    private int numOfTokens;
    private List<BookAuthor> authors = new ArrayList<>();

    public Book(String title, String category, double cost, int numOfTokens) {
        super(title, category, cost);
        this.numOfTokens = numOfTokens;
    }

    public int getNumOfTokens() {
        return numOfTokens;
    }

    public List<BookAuthor> getAuthors() {
        return authors;
    }

    public void addAuthor(BookAuthor author) {
        if (!authors.contains(author)) {
            authors.add(author);
        } else {
            System.out.println("Author already exists.");
        }
    }

    public void removeAuthor(BookAuthor author) {
        if (authors.remove(author)) {
            System.out.println("Author removed successfully.");
        } else {
            System.out.println("Author does not exist.");
        }
    }
    
    public String toString() {
        StringBuilder authorList = new StringBuilder();
        for (BookAuthor author : authors) {
            authorList.append(" - ").append(author.toString()).append("\n");
        }
        return "Book" + super.toString()
                + "[" + numOfTokens + "]"
                + "\nAuthors:\n" + authorList.toString();
    }
}
   
