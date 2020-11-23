package libraryproject;

public class Member {

    private int memberID;
    private String memberName;
    private String[] book = new String[2];
    private int numberOfBook;

    public Member(int id, String name) {
        this.memberName = name;
        this.memberID = id;
        numberOfBook = 0;
    }

    public int getMemberID() {
        return memberID;
    }

    public String getBook(int n) {
        if (n >= 2 || n <= -1 || book[n] == null) {
            return "none";
        }
        return book[n];
    }

    public void addBook(String b) {
        for (int i = 0; i < book.length; i++) {
            if (book[i] == null) {
                book[i] = b;
                numberOfBook++;
                break;
            }
        }
    }

    public void cancelBook(String c) {

        for (int i = 0; i < book.length; i++) {
            if (book[i] != null) {
                if (book[i].equals(c)) {
                    book[i] = null;
                    numberOfBook--;
                }
            }
        }
    }

    public String getName() {
        return memberName;

    }

    public int getNumberOfBook() {
        return numberOfBook;
    }

    @Override
    public String toString() {
        String book = "";
        if (this.book[0] != null || this.book[1] != null) {
            book += "\n" + "Borrowed book : ";
        }
        if (this.book[0] != null) {
            book += this.book[0];
            if (this.book[1] != null) {
                book += ", ";
            }
        }

        if (this.book[1] != null) {
            book += this.book[1];
        }
        if (memberID == -1) {
            return "Full of members!!";
        }
        return "Your member ID = " + memberID + ", Your member name = " + memberName + book;
    }

}
