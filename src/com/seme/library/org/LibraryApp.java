package com.seme.library.org;

import java.util.HashSet;
import java.util.Scanner;

public class LibraryApp {
    static Scanner input = new Scanner(System.in);
    static HashSet<Books> libBooks = new HashSet<>();
    static HashSet<Books> borrowed = new HashSet<>();


    public static void main(String[] args) {

        //HashSet<Books> lBooks=new HashSet<>();

        System.out.println(" Welcome to Library Application !!");

        System.out.println(" Please Select what you want to do from the main menu: \n");
        String doOther = "";

        do {

            System.out.println("MENU: \n 1. List Books \n 2 . Add Books  \n 3. Borrow Books \n 4. Return Books ");

            int choice = input.nextInt();
            input.nextLine();

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
                System.out.println("Enter the title of the book you want to return ?");
                String retBook = input.nextLine();
                //return books
                returnBooks(retBook);
            } else {
                System.out.println("You Selected improper Menu List ");
            }
            System.out.println("Do you want to perform another task :");
            doOther = input.nextLine();

        } while (doOther.equalsIgnoreCase("yes"));


    }

    private static void borrowBooks(String bTitle) {


        // show list of available books listBooks()
        listBooks();

        // input the book you wanna borrow
        for (Books book : libBooks) {
            if (bTitle.equals(book.getTitle())) {
                //change the status of the book
                book.setBorrowed("borrowed");
            }
        }
        // if(book.tile. is in the list)
        //remove the book
        //
        listBooks();


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
            // System.out.println("Enter the status of the book:");
            // String status = input.nextLine();
            book.setBorrowed("available");

            System.out.println("Do you want to add more Books ?");
            addBook = input.nextLine();
            libBooks.add(book);

        } while (addBook.equalsIgnoreCase("yes"));

        //show list of books added
        //  System.out.println("The available books are :"+ libBooks.size());
        listBooks();
    }

    private static void listBooks() {

        System.out.println("The LIst of Available Books in the library are: ");

        for (Books book : libBooks) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Year of Publication: " + book.getYear());
            System.out.println("Status: " + book.getBorrowed());
        }

    }

    private static void returnBooks(String title) {

        for (Books book : libBooks) {
            if (book.getBorrowed().equalsIgnoreCase("borrowed")) {
                //  System.out.println(book.getTitle());

                /*System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Year of Publication: " + book.getYear());
                System.out.println("Status: " + book.getBorrowed());*/
                borrowed.add(book);
              //  libBooks.remove(book);
            }
                // if the title is equal to one of the borrowed book title
            for(Books bookb:borrowed){
                if(title.equals(bookb.getTitle())){
                    bookb.setBorrowed("available");
                    libBooks.add(bookb);
                }
                else{
                    System.out.println("the book is not in borrowed list !");
                }
            }
            listBooks();
            }

    }

}

