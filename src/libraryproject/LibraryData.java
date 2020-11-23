package libraryproject;

/**
 * This is class LibraryData.
 *
 * @author Student
 */
public class LibraryData {

    private int memberId;
    private String memberName;
    private String[] bookLimit = new String[2];
    private int numberLimit;

    /**
     * This is Constructor for class LibraryData.
     * @param id
     * @param name
     */
    public LibraryData(int id, String name) {
        this.memberName = name;
        this.memberId = id;
        numberLimit = 0;
    }

    /**
     * This Method will get member ID
     * @return member ID
     */
    public int getMemberID() {
        return memberId;
    }

    /**
     * This Method will get a book
     * @param n
     * @return limit of book
     */
    public String getBook(int n) {
        if (n >= 2 || n <= -1 || bookLimit[n] == null) {
            return "None";
        }
        return bookLimit[n];
    }

    /**
     * This method will add book
     * @param b
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
     * This method will cancel borrow a book
     * @param c
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
     * This method will get the name member
     * @return name 
     */
    public String getName() {
        return memberName;

    }

    /**
     * This method will get number of limit
     * @return number of limit
     */
    public int getNumberLimit() {
        return numberLimit;
    }

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
