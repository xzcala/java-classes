/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcbrzfbooks;

/**
 *
 * @author Jon
 */
public class Book {
    private String name;
    private String author;
    private double price;
    private Category category;
    private int version;
    public static int numberOfBooks = 0;
    
    public Book(){
        this.name="";
        this.author="";
        ++numberOfBooks; 
    }
    
    public Book(String name, String author) {
        this(); //chain to first constructor
        this.name=name;
        this.author=author;
        this.version=0;
    }
    
    public Book(String name, String author, double price, Category category) {
        this(name,author); //chain to the second constructor
        this.price=price;
        this.category=category;
        this.version=1;
    }
    
    public void setName(String name){
        this.name=name;
        ++this.version;
    }
    
    public void setAuthor(String author){
        this.author=author;
        ++this.version;
    }
    
    public void setPrice(double price){
        this.price=price;
    }
    
    public void setCategory(Category category){
        this.category=category;
    }
    
    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }
    
    public double getPrice(){
        return price;
    }
    
    public Category getCategory(){
        return category;
    }
    
    public int getVersion(){
        return version;
    }
    
}
