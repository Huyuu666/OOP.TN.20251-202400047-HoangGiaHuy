package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String title;
    private String category;
    private double cost;
    private List<BookAuthor> authors = new ArrayList<>();
    private int numOfTokens;
    private static int nbBook = 0;

    public Book() {
        nbBook ++;
        this.id = nbBook;
    }

    public Book(String title, String category, double cost, List<BookAuthor> authors, int numOfTokens) {
        nbBook ++;
        this.id = nbBook;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.authors = authors;
        this.numOfTokens = numOfTokens;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public double getCost() {
        return cost;
    }

    public List<BookAuthor> getAuthors() {
        return authors;
    }

    public int getnumOfTokens() {
        return numOfTokens;
    }

    @Override
    public String toString() {
        return "- Book[" + this.id + "] - ["
                + this.title + "] - ["
                + this.cost + "] - ["
                + this.category + "] - ["
                + this.numOfTokens + "]"
                + "\nAuthors: " + this.authors;
    }
}
