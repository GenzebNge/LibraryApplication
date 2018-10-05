package com.seme.library.org;

import java.util.HashSet;
import java.util.Scanner;

public class LibraryApp {
    static Scanner input = new Scanner(System.in);
    static HashSet<Books> libBooks = new HashSet<>();


    public static void main(String[] args) {

        //HashSet<Books> lBooks=new HashSet<>();

        System.out.println(" Welcome to Library Application !!");

        System.out.println(" Please Select what you want to do from the main menu: \n");

        System.out.println("MENU: \n 1. List Books \n 2 . Add Books  \n 3. Borrow Books \n 4. Return Books ");

        int choice = input.nextInt();

        if (choice == 1) {
            // show list of books
            listBooks();
            //show list of books and their status
        } else if (choice == 2) {
            //Add the books
            addBooks();
            // create a book class and add the entity
        } else if (choice == 3) {
            //borrow books
            System.out.println("Enter the title of the book you want to borrow ?");
            String bTitle = input.nextLine();
            borrowBooks(bTitle);
            //show list of available books
        } else if (choice == 4) {
            //return books
            returnBooks();
        } else {
            System.out.println("You Selected improper Menu List ");
        }


    }

    private static void borrowBooks(String bTitle) {

        boolean borrowed =false;

        for(Books book:libBooks) {

            if (bTitle.equals(book.getTitle())){
               // book.isBorrowed();
                System.out.println( book.getTitle()+ " is " + book.isBorrowed());
                borrowed =true;
            }
            else{
                borrowed =false;

                System.out.println();
            }

        }

    }


    private static void addBooks() {

        System.out.println("Adding List of Books to the Library !");
        String addBook = "";
        do {
            Books book = new Books();
            System.out.println("Enter the title of the book :");
            String title = input.nextLine();
            book.setTitle(title);
            System.out.println("Enter the Author of the book :");
            String author = input.nextLine();
            book.setAuthor(author);
            System.out.println("Enter year of Publication :");
            String year = input.nextLine();
            book.setYear(year);

            System.out.println("Do you want to add more Books ?");
            addBook = input.nextLine();
            libBooks.add(book);

        } while (addBook.equalsIgnoreCase("yes"));

        //show list of books added
        //  System.out.println("The available books are :"+ libBooks.size());
        listBooks();
        // indicate if each book is borrowed or not
        //borrowBooks(String title);
    }

    private static void listBooks() {

        System.out.println("The LIst of Available Books are: ");

        for (Books book : libBooks) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Year of Publication: " + book.getYear());
        }

    }


    private static void returnBooks() {

        // list of borrowed books

        // return book input the title
        // return book''
        //update list of books


    }


}

















        /*private static void borrowBooks (String title) {
           *//*boolean borrowed = false;
           int found =0;
          // show list of available books
            listBooks();
            //allow the user to borrow specific book with title

            for(Books book: libBooks) {

                if (title.equals(book.getTitle())) {
                  //  book.isBorrowed();
                    found =1;
                    // the book is available so you can borrow
                    System.out.println( book+"is borrowed");
                }
                else if(!book.isBorrowed()){
                    //book.isBorrowed();
                    found =2;
                    break;

                    //System.out.println("The book "+ book + "is not available fot borrowing ");
                }
                else{
                   // System.out.println("The Book isn't available in our catalog !");
                    found =0;
                }


                }
            if (found == 0) {
                System.out.println("Sorry, this book is not in our catalog.");
            } else if (found == 1) {
                System.out.println("Sorry, this book is already borrowed.");
            } else if (found == 2) {
                System.out.println("You successfully borrowed " + title);
            }
*//*



                }


}
*/
                //if borrowed is true make that book as borrowed
