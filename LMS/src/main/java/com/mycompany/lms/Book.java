
package com.mycompany.lms;


public class Book extends LibraryItem{
     private String bookName;
     private int numberOfBook;
    public Book(int itemId, String title, String author, int publicationYear, boolean isAvailable,String bookName,int numberOfBook) {
        super(itemId, title, author, publicationYear, isAvailable);
        this.bookName=bookName;
        this.numberOfBook=numberOfBook;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumberOfBook() {
        return numberOfBook;
    }

    public void setNumberOfBook(int numberOfBook) {
        this.numberOfBook = numberOfBook;
    }
     @Override
    void checkoutItem(){
        super.checkoutItem();
        System.out.println("Book Name: "+bookName);
        System.out.println("Number Of Book: "+numberOfBook);
        
    }
}
