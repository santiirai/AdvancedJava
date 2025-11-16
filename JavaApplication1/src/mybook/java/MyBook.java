/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mybook.java;

/**
 *
 * @author shanti
 */
/*create a Book class with attributes title,author, and price, which has function to print details and parameterized constructor to initiliaze
their value. WAP to create objects.*/

import java.util.Scanner;

class Book{
  private String title, author;
  private float price;

  Book(String title, String author, float price){
    this.title = title;
    this.author = author;
    this.price = price;
  }

  void display(){
    System.out.println("Title: "+title);
    System.out.println("Author: "+author);
    System.out.println("Price: "+price);
  }
}


public class MyBook {
    public static void main(String[] args) {
        String t,a;
        float p;
        Scanner sc = new Scanner(System.in);

        Book[] book = new Book[2];
        for(int i=0;i<book.length;i++){

        System.out.println("Enter Title: ");
        t = sc.nextLine();
        System.out.println("Enter Author: ");
        a = sc.nextLine();
        System.out.println("Enter price: ");
        p = sc.nextFloat();
     book[i] = new Book(t, a, p);
        }
        for (Book book1 : book){
             book1.display();
        }
    }
}
