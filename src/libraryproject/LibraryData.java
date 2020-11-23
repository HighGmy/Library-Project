package libraryproject;

/**
 * This is class LibraryData.
 * @author Student
 */

public class LibraryData {
    
    private int memberId;
    private String memberName;
    private String[] bookLimit = new String[2];
    private int numberLimit;

    /**
    * 
    * @param
    * @param
    */
    
    
    public LibraryData(int id, String name) {
        this.memberName = name;
        this.memberId = id;
        numberLimit = 0;
    }

    /**
    * 
    */
    
    public int getMemberID() {
        return memberId;
    }

    /**
    * 
    * @param
    */
    
    public String getBook(int n) {
        if (n >= 2 || n <= -1 || bookLimit[n] == null) {
            return "None";
        }
        return bookLimit[n];
    }

    /**
    * 
    * @param 
    */
    
    public void addBook(String b) {
        for (int i = 0; i < bookLimit.length; i++) {
            if (bookLimit[i] == null) {
                bookLimit[i] = b;
                numberLimit++;
                break;
            }
        }
    }

    /**
    * 
    * @param
    */
    
    public void cancelBook(String c) {

        for (int i = 0; i < bookLimit.length; i++) {
            if (bookLimit[i] != null) {
                if (bookLimit[i].equals(c)) {
                    bookLimit[i] = null;
                    numberLimit--;
                }
            }
        }
    }

    /**
    * 
    */
    
    public String getName() {
        return memberName;

    }
    
    /**
    * 
    */

    public int getNumberLimit() {
        return numberLimit;
    }

    /**
    * 
    */
    
    @Override
    public String toString() {
        String book = "";
        if (this.bookLimit[0] != null || this.bookLimit[1] != null) {
            book += "\n" + "Borrowed book : ";
        }
        if (this.bookLimit[0] != null) {
            book += this.bookLimit[0];
            if (this.bookLimit[1] != null) {
                book += ", ";
            }
        }

        if (this.bookLimit[1] != null) {
            book += this.bookLimit[1];
        }
        if (memberId == -1) {
            return "Full of members!";
        }
        return "[ Your member ID = " + memberId + ", Your member name = " + memberName + " ]" + book;
    }

}
