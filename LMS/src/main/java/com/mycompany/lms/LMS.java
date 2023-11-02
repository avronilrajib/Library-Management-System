/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lms;

/**
 *
 * @author DELL
 */
public class LMS {

    public static void main(String[] args) {
        LibraryItem Lb1=new LibraryItem(
                1,
                "ABC",
                "Mujib",
                1999,
                true);
        Lb1.checkoutItem();
        Book Lb2=new Book(
                2,
                "ABCD",
                "Arnab",
                2001,
                true,
                "SharpedPlugin",
                100);
        Lb2.checkoutItem();
        Journal Lb3=new Journal(
                3,
                "ABCDE",
                "Angkon",
                2002,
                true,
                200);
        Lb3.checkoutItem();
        DVD Lb4=new DVD(
                4,
                "ABCEDEF",
                "Rohomot Ali",
                1999,
                true,
                true);
        Lb4.checkoutItem();
        
        
    }
}
