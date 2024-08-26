package _J_14_01_Array_List_IT_ST;


import java.util.ArrayList;
import java.util.List; 

//class book 
class Book  
{ 

 public String title; 
 public String author; 
   
 Book(String title, String author) 
 { 
       
     this.title = title; 
     this.author = author; 
 } 
} 

//Libary class contains  
//list of books. 
class Library  
{ 

 // reference to refer to list of books. 
 private final List<Book> books; 
   
 Library (List<Book> books) 
 { 
     this.books = books;  
 } 
   
 public  List<Book> getTotalBooksInLibrary(){ 
       
    return books;   
 } 
   
} 

//main method 
class compoclass  
{ 
 public static void main (String[] args)  
 { 
       
     // Creating the Objects of Book class. 
     Book b1 = new Book("Effective Java", "Jos"); 
     Book b2 = new Book("Thinking in Java", "Bruce"); 
     Book b3 = new Book("Java: The Complete Reference", "Herbert"); 
       
     // Creating the list which contains the  
     // no. of books. 
     List<Book> books = new ArrayList<Book>(); 
     books.add(b1); 
     books.add(b2); 
     books.add(b3); 
       
     Library library = new Library(books); 
       
     List<Book> TNB = library.getTotalBooksInLibrary(); 
     for(Book bn : TNB){ 
           
         System.out.println("Title : " + bn.title + " and " 
         +" Author : " + bn.author); 
     } 
 } 
} 
