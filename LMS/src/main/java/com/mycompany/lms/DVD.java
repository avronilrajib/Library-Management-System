/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lms;

/**
 *
 * @author DELL
 */
public class DVD extends LibraryItem{
    private boolean hasDVD;
    
    public DVD(int itemId, String title, String author, int publicationYear, boolean isAvailable,boolean hasDVD) {
        super(itemId, title, author, publicationYear, isAvailable);
    }

    public boolean isHasDVD() {
        return hasDVD;
    }

    public void setHasDVD(boolean hasDVD) {
        this.hasDVD = hasDVD;
    }
     @Override
    void checkoutItem(){
        super.checkoutItem();
         System.out.println("Is Has DVD:"+hasDVD);
        
    }
    
    
}
