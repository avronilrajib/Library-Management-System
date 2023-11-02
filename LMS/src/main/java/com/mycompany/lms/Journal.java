/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lms;

/**
 *
 * @author DELL
 */
public class Journal extends LibraryItem{
    private int numberOfPublication;
    public Journal(int itemId, String title, String author, int publicationYear, boolean isAvailable,int numberOfPublication) {
        super(itemId, title, author, publicationYear, isAvailable);
        this.numberOfPublication=numberOfPublication;
        
    }

    public int getNumberOfPublication() {
        return numberOfPublication;
    }

    public void setNumberOfPublication(int numberOfPublication) {
        this.numberOfPublication = numberOfPublication;
    }
    
    
    
     @Override
    void checkoutItem(){
        super.checkoutItem();
         System.out.println("Number Of Publication:"+numberOfPublication);
        
    }
    
}
