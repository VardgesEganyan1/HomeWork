package scannerDemo;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Plase input a");
        //String scan = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Plase inout b");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Plase input operator");
        String op = scanner.nextLine();
       // String[] fullNameArray = fullNAme.split(" ");
       // System.out.println(fullNameArray[0] + " " +  fullNameArray[1]);



        if(op.equals("+")){
            System.out.println(a + b);
        } else if (op.equals("-")) {
            System.out.println(a - b);

        }else {
            System.out.println("not operator");
        }

    }
}
