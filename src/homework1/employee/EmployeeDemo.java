package homework1.employee;

import homework1.Sort;
import scannerDemo.Book;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();

        boolean run = true;
        while (run){
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for print ");
            System.out.println("Please input 3 for search emlpoee id");
            System.out.println("Please input 4 for search by compony name");
            String command = scanner.nextLine();

            switch (command){
                case  "0":
                    run = false;
                    break;
                case "1":
                    System.out.println("Please input  name");
                    String name = scanner.nextLine();
                    System.out.println("Please input surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input empleeID");
                    String  emplyeeID = scanner.nextLine();
                    System.out.println("Please input salary ");
                    double salary = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please input company");
                    String company = scanner.nextLine();
                    System.out.println("Please position");
                    String position = scanner.nextLine();

                    Employee employee = new Employee(name,surname,emplyeeID,salary,company,position);
                    employeeStorage.add(employee);
                    break;
                case  "2":
                    employeeStorage.print();
                    break;
                case  "3":
                    System.out.println("please input id");
                    String id = scanner.nextLine();
                    employeeStorage.seaarchById(id);
                    break;
                case "4":
                    System.out.println("please input company name");
                    String companyName = scanner.nextLine();
                    employeeStorage.searchByCompany(companyName);
            }
        }


    }
}
