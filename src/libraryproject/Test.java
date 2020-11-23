package libraryproject;

import java.util.Scanner;

public class Test {

    static int ID = 0;
    static Scanner keyboard = new Scanner(System.in);
    static Library gmm = new Library();

    public static void main(String[] args) {

        String bookBorrow = null;

        int option = 0;

        do {
            System.out.println("------------------------------------");
            System.out.println(":          Library Booking         :");
            System.out.println("------------------------------------");
            System.out.println(" ");
            System.out.println("Please Enter 1 to Register");
            System.out.println("Please Enter 2 to Borrow a book");
            System.out.println("Please Enter 3 to Return a book");
            System.out.println("Please Enter 4 to Check status");
            System.out.println("Please Enter 5 to Exit\n");
            System.out.print("Enter Option: ");

            option = getNumberFromKeyboard();

            if (option == 1) {
                System.out.print("Please insert name: ");
                String name = keyboard.nextLine();
                System.out.println(gmm.registMember(name));

            }

            if (option == 2) {
                System.out.println("List of books : " + gmm.showBook());
                if (!gmm.checkAllMember()) {
                    getIdFromKeyboard();
                    System.out.print("Insert name of books : ");
//                  keyboard.nextLine();
                    bookBorrow = keyboard.nextLine();
                    System.out.println(gmm.borrowBook(bookBorrow, gmm.whoBorrowByIndex(ID)));
                } else {
                    System.out.println(" ----> Not have members yet!! <---- ");
                    System.out.println(" ");
                }
            }

            if (option == 3) {
                System.out.println("List of books : " + gmm.showBook());
                if (!gmm.checkAllMember()) {
                    getIdFromKeyboard();
                    if (gmm.getMember(ID).getBook(0) != null || gmm.getMember(ID).getBook(0) != null) {
                        System.out.print("Insert name of books : ");
                        String bookReturn = keyboard.nextLine();
                        System.out.println(gmm.returnBook(bookReturn, gmm.whoBorrowByIndex(ID)));
                    } else {
                        System.out.println("Not have a book to return");
                    }
                } else {
                    System.out.println(" ----> Not have members yet!! <---- ");
                    System.out.println(" ");
                }
            }

            if (option == 4) {
                if (!gmm.checkAllMember()) {
                    getIdFromKeyboard();
                    System.out.println("Name : " + gmm.getMember(gmm.whoBorrowByIndex(ID)).toString());
                } else {
                    System.out.println(" ----> Not have members yet!! <---- ");
                    System.out.println(" ");
                }
            }

            if (option == 5) {
                System.exit(0);
            }

        } while (true);

    }

    public static int getNumberFromKeyboard() {
        int number = 0;
        while (!keyboard.hasNextInt()) {
            System.out.println(" ----> Not this!! <---- ");
            keyboard.next();

        }
        number = keyboard.nextInt();
        keyboard.nextLine();
        return number;
    }

    public static void getIdFromKeyboard() {
        do {
            System.out.print("Insert your ID : ");
            ID = getNumberFromKeyboard();

        } while (!gmm.checkName(ID));

    }
}
