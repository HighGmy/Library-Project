/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryproject;


/**
 *
 * @author Asus
 */
public class library {
    private String[] book = {"English","Math","Science","Social","Art","History","Physic","Chemistry"};
    private String bb;
    private String rb;
    
    
    
    public library(){
        this.bb = bb;
        this.rb = rb;
        
    }
    
    public String showBook(){
        String Book = book[0];
        for(int i = 1;i < book.length;i++){
            
            Book +=  " ," + book[i];}
        return Book;
        
    }
    public String borrowBook(String bb){
        switch (bb) {
            case "English":
                book[0] = "[Borrowed]";
                return book[0];
            case "Math":
                book[1] = "[Borrowed]";
                return book[1];
            case "Science":
                book[2] =  "[Borrowed]";
                return book[2];
            case "Social":
                book[3] =  "[Borrowed]";
                return book[3];
            case "Art":
                book[4] =  "[Borrowed]";
                return book[4];
            case "History":
                book[5] =  "[Borrowed]";
                return book[5];
            case "Physic":
                book[6] =  "[Borrowed]";
                return book[6];
            case "Chemistry":
                book[7] =  "[Borrowed]";
                return book[7];
            default:
                break;
        }return null;
            }
    
    
    public String returnBook(String rb){
        switch (rb) {
            case "English":
                book[0] = "English";
                return book[0];
            case "Math":
                book[1] = "Math";
                return book[1];
            case "Science":
                book[2] =  "Science";
                return book[2];
            case "Social":
                book[3] =  "Social";
                return book[3];
            case "Art":
                book[4] =  "Art";
                return book[4];
            case "History":
                book[5] =  "History";
                return book[5];
            case "Physic":
                book[6] =  "Physic";
                return book[6];
            case "Chemistry":
                book[7] =  "Chemistry";
                return book[7];
            default:
                break;
        }return null;
            }
    }

