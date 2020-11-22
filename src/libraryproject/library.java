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

    private String[] book = {"English", "Math", "Science", "Social", "Art", "History", "Physic", "Chemistry"};
    private Member[] nameMem = new Member[10];
    private String bb;
    private String rb;
    private int id;

    public library() {

       

    }

    public Member registMember(String name) {
        int a;
        for (int i = 0; i < nameMem.length; i++) {
            if (nameMem[i] == null) {
                nameMem[i] = new Member(id, name);
                a = id;
                id++;
                return nameMem[a];
            }
        }
        return new Member(-1, "empty");
    }

    public String showBook() {
        String Book = book[0];
        for (int i = 1; i < book.length; i++) {

            Book += " ," + book[i];
        }
        return Book;
    }

    public int whoBorrowByIndex(int k) {
        for (int i = 0; i < nameMem.length; i++) {
            if (nameMem[i] != null) {
                if (nameMem[i].getMemberID() == k) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    

    public String borrowBook(String bb, int d) {
        if(nameMem[whoBorrowByIndex(d)].getBookHead()>=2){
            return "Limit to borrow!!";
        }
        switch (bb) {
            case "English":
                nameMem[d].addBook(book[0]);
                book[0] = "[Borrowed]";
                return book[0];
            case "Math":
                nameMem[d].addBook(book[1]);
                book[1] = "[Borrowed]";
                return book[1];
            case "Science":
                nameMem[d].addBook(book[2]);
                book[2] = "[Borrowed]";
                return book[2];
            case "Social":
                nameMem[d].addBook(book[3]);
                book[3] = "[Borrowed]";
                return book[3];
            case "Art":
                nameMem[d].addBook(book[4]);
                book[4] = "[Borrowed]";
                return book[4];
            case "History":
                nameMem[d].addBook(book[5]);
                book[5] = "[Borrowed]";
                return book[5];
            case "Physic":
                nameMem[d].addBook(book[6]);
                book[6] = "[Borrowed]";
                return book[6];
            case "Chemistry":
                nameMem[d].addBook(book[7]);
                book[7] = "[Borrowed]";
                return book[7];
            default:
                break;
        }
        
        return "Not have in our library";
        
    }
    

    public String returnBook(String rb,int d) {
        switch (rb) {
            case "English":
                book[0] = "English";
                nameMem[d].cancelBook(book[0]);
                return book[0];
            case "Math":
               
                book[1] = "Math";
                 nameMem[d].cancelBook(book[1]);
                return book[1];
            case "Science":
                
                book[2] = "Science";
                nameMem[d].cancelBook(book[2]);
                return book[2];
            case "Social":
               
                book[3] = "Social";
                 nameMem[d].cancelBook(book[3]);
                return book[3];
            case "Art":
               
                book[4] = "Art";
                 nameMem[d].cancelBook(book[4]);
                return book[4];
            case "History":
                
                book[5] = "History";
                nameMem[d].cancelBook(book[5]);
                return book[5];
            case "Physic":
                
                book[6] = "Physic";
                nameMem[d].cancelBook(book[6]);
                return book[6];
            case "Chemistry":
                
                book[7] = "Chemistry";
                nameMem[d].cancelBook(book[7]);
                return book[7];

            default:
                break;
        }
        return null;
    }

    public boolean checkName(int e) {
        for (int i = 0; i < nameMem.length; i++) {
            if(nameMem[i]!=null){
            if (nameMem[i].getMemberID() == e) {
                return true;
            }}
        }
        return false;
    }
    public Member getMember(int i){return nameMem[i];}
}
