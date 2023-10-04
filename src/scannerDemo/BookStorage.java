package scannerDemo;

public class BookStorage {
    private  Book[] books = new Book[10];
    private  int size;

    public void add(Book book){
        if(size == 9){
            System.out.println("error");
        }
        books[size++] = book;

    }

  public void print(){

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getTitle() + " " + books[i].getAuthorName() + " " +books[i].getPrice() );

        }

    }


}
