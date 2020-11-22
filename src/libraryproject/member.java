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
public class Member {

    private int memberID;
    private String memberName;
    private String[] book = new String[2];
    private int bookHead;
    
    public Member(int id,String name){
      this.memberName = name;
      this.memberID=id;
      bookHead=0;
    }

    
    public int getMemberID(){
        return memberID;
    }
    
    public String getBook(int n){
        if(n >= 2 || n <= -1){
            return "none";
        }
        return book[n];
    }
    
    public void addBook(String b){
        book[bookHead] = b;
        bookHead++;
    }
    
    public void cancelBook(String c){
        
        for(int i=0; i < book.length;i++){
            if(book[i]!=null){
            if(book[i].equals(c)){
                book[i] = null;}
                
            }
        } 
        
        
    }
    
    public String getName(){
        return memberName;
        
    }

    public int getBookHead() {
        return bookHead;
    }
    
    @Override
    public String toString() {
        String book = "";
        if(this.book[0]!=null){book+="\n"+"Borrowed book : "+this.book[0];}
        if(this.book[1]!=null){book+=" "+this.book[1];}
        
        return "Member : " + "Your member ID = " + memberID + ", Your member name = " + memberName + '}'+book;
    }


    
   
    
}