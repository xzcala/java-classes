/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcbrzfbooks;

import static jcbrzfbooks.Book.numberOfBooks;
import static jcbrzfbooks.Category.*;

/**
 *
 * @author Jon
 */
public class JcbrzfBooks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book book1 = new Book("Grant","Ron Chernow");
        book1.setPrice(22.00);
        book1.setCategory(HISTORY);
        
        Book book2 = new Book("Goodnight Moon","Margaret",8.94,CHILDREN);
        
        Book book3 = new Book();
        book3.setName("The Martian");
        book3.setAuthor("Andy Weir");
        book3.setPrice(15.63);
        book3.setCategory(SCI_FI);
        
        System.out.println("Book 1:\nName: "+book1.getName()+"\nAuthor: "+book1.getAuthor()+"\nPrice: $"+book1.getPrice()+"\nVersion: "+book1.getVersion());
        System.out.println();
        System.out.println("Book 2:\nName: "+book2.getName()+"\nAuthor: "+book2.getAuthor()+"\nPrice: $"+book2.getPrice()+"\nVersion: "+book2.getVersion());
        System.out.println();
        System.out.println("Book 3:\nName: "+book3.getName()+"\nAuthor: "+book3.getAuthor()+"\nPrice: $"+book3.getPrice()+"\nVersion: "+book3.getVersion());
        System.out.println();
        System.out.println("Number of Books: " +numberOfBooks);
        
    }
    
}
