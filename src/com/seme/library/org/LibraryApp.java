package com.seme.library.org;

import java.util.HashSet;
import java.util.Scanner;

public class LibraryApp {
    static Scanner input;



    public static void main(String[] args) {
        HashSet<Books> listBooks=new HashSet<>();

        System.out.println("Welcome to Library Application !!");

        System.out.println(" Please Select what you want to do from the main menu: \n");
        System.out.println("MENU: \n 1. List Books \n 2. Add Books  \n 3. Borrow Books \n 4. Return Books ");

       int choice = input.nextInt();

        if (choice == 1) {
            // show list of books

            listBooks(listBooks);
            //show list of books and their status
        } else if (choice == 2) {
            //Add the books
            addBooks();
            // create a book class and add the entity
        } else if (choice == 3) {
            //borrow books
            borrowBooks();
            //show list of available books
        } else if (choice == 4) {
            //return books
            returnBooks();
        }


    }


    private static void addBooks() {

        HashSet<Books> listBooks = new HashSet<>();
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
            listBooks.add(book);

        } while (addBook.equalsIgnoreCase("yes"));


        //show list of books added
        listBooks(listBooks);


    }

        private static void listBooks(HashSet<Books> listBooks) {

            System.out.println("The LIst of Available Books are: ");

            for(Books book :listBooks){
                System.out.println("Title: "+book.getTitle());
                System.out.println("Author: "+ book.getAuthor());
                System.out.println("Year of Publication: "+ book.getYear());
            }

        }


        private static void returnBooks () {

        }

        private static void borrowBooks () {

        }

}
