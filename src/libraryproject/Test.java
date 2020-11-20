/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryproject;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Test {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String bookBorrow = null;
        int ID = 0;
        library gmm = new library();
        member m = new member();
        
        int option = 0;
        
        Scanner select = new Scanner(System.in);
        Scanner choice = new Scanner(System.in);
        
        do {
            System.out.println("------------------------------------");
            System.out.println(":          Library Booking         :");
            System.out.println("------------------------------------");
            System.out.println("Please Enter 1 to ");
            System.out.println("Please Enter 2 to borrow book");
            System.out.println("Please Enter 3 to return book");
            System.out.println("Please Enter 4 to Show ");
            System.out.println("Please Enter 5 to Exit\n");

            System.out.print("Enter Option: ");
            option = select.nextInt();
            
            if (option == 1) {
                System.out.println(" ");
                System.out.println("-------------------------\n");
            }

            if (option == 2) {
                System.out.println("รายชื่อหนังสือ : " + gmm.showBook());
                System.out.print("ใส่ชื่อหนังสือที่จะยืม : "); 
                bookBorrow = keyboard.nextLine();
                gmm.borrowBook(bookBorrow);
                if(keyboard.hasNext()){keyboard.next();}
                System.out.print("Insert your ID : ");
                ID = keyboard.nextInt();
                
                m.getMemberID(ID);


            }
            
            if (option == 3) {
                System.out.println("รายชื่อหนังสือ : " + gmm.showBook());
                System.out.print("ใส่ชื่อหนังสือที่จะคืน : ");
                String bookReturn = keyboard.nextLine();
                gmm.returnBook(bookReturn);
                System.out.print("Insert your ID : ");
                ID = keyboard.nextInt();
                
                System.out.println(ID);


            }
            
            if (option == 4) {
                System.out.println("ID : " + m.getMemberID(ID));
                System.out.println("Name : ");
                System.out.println("Book : " + bookBorrow);
                System.out.println("Date : ");
            }
            if (option == 5) {
                System.exit(0);
            }
            
        }while (true);
        
    }
    
    
    
        
//        library gmm = new library("Art","Art");
//        System.out.println("List of Book: " + gmm.showBook());
//        
//        
//        //ใส่ชื่อ
//        System.out.print("Please input your ID : ");
//        String memberID = keyboard.nextLine();
//        
//        //ยืมหนังสือ
//        System.out.print("ใส่ชื่อหนังสือที่จะยืม : ");
//        String bookBorrow = keyboard.nextLine();
//
//        gmm.borrowBook(bookBorrow);
//        
//        System.out.println(gmm.showBook());
//        
//        /*---------------------------------------------------------------*/
//        //คืนหนังสือ
//        System.out.print("ใส่ชื่อหนังสือที่จะคืน : ");
//        String bookReturn = keyboard.nextLine();
//        gmm.returnBook(bookReturn);
//        
//        System.out.println(gmm.showBook());
//        
//         /*---------------------------------------------------------------*/
//        //
        
        
    }

