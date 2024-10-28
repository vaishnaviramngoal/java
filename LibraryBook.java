public class LibraryBook {

    static String libraryName ;
    static int totalBooks ;
    static String librarian ;
    String title;
    String author;
    String bookName;
    boolean isAvailable;

     static {
       libraryName = "City Central Library";
       totalBooks = 50000;
       librarian = "Ms. Jane";
       }

     public LibraryBook(String title, String author, String bookName, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.bookName = bookName;
         this.isAvailable = isAvailable;
       }
          
       public void printLibraryBookInfo() {

          System.out.println("LibraryName: " +libraryName);
          System.out.println("totalBooks: " +totalBooks);
          System.out.println("librarian: " +librarian);
          System.out.println("title: " +title);
          System.out.println("author: " +author);
          System.out.println("bookName: " +bookName);
          System.out.println("isAvailable: " +isAvailable);
        }
}