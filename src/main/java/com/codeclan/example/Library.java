package com.codeclan.example;

import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> books;

    public Library(){
        this.books = new ArrayList<Book>();
        this.capacity = 5;
    }

    public int stockCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        if (stockCount() < capacity){
            this.books.add(book);
            System.out.println("Book " + book.getTitle() + " added to the library.");
        } else {
            System.out.println("Library stock has reached capacity. No more books can be added.");
        }
        }
    }


