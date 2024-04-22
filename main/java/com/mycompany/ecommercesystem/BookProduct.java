package com.mycompany.ecommercesystem;
public class BookProduct extends product {
    protected String author;
   protected String publisher;

    public BookProduct(String author, String publisher, int procutid, String name, float price) {
        super(procutid, name, price);
        this.author = author;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    
}
