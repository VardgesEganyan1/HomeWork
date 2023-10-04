package scannerDemo;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        //Book  book = new Book("Girq","Jonh",2500,3);
        Scanner scanner = new Scanner(System.in);
        BookStorage bookStorage = new BookStorage();

        boolean run = true;
        while (run){
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for ADD BOOK");
            System.out.println("Please input 2 for SEARCH BOOK");
            System.out.println("Please input 3 for PRINT ALL BOOKS");
            String command = scanner.nextLine();

            switch (command){
                case  "0":
                    run = false;
                    break;
                case "1":
                    System.out.println("Please input book title");
                    String title = scanner.nextLine();
                    System.out.println("Please input author name");
                    String authorName = scanner.nextLine();
                    System.out.println("Please input price");
                    double price = Integer.parseInt(scanner.nextLine());
                    int count = Integer.parseInt(scanner.nextLine());
                    Book book = new Book(title,authorName,price,count);
                    bookStorage.add(book);
                    break;
                case  "2":
                    break;
                case  "3":
                    bookStorage.print();
                    break;
            }
        }





    }
}
