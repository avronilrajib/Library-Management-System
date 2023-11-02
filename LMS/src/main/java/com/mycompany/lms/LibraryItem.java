
package com.mycompany.lms;

/**
 *
 * @author DELL
 */
public class LibraryItem {
    private int itemId;
    private String title, author;
    private int publicationYear;
    private boolean isAvailable;

    public LibraryItem(int itemId, String title, String author, int publicationYear, boolean isAvailable) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = isAvailable;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    void checkoutItem(){
        System.out.println("Item ID: "+itemId);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("PublicationYear: "+publicationYear);
        System.out.println("isAvailable: "+isAvailable);
        
    }
}
