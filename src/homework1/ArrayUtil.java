package homework1;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        System.out.print("all value: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i] );
        }

        System.out.println();

        System.out.println("first value: " + numbers[0]);
        int lastNum = numbers.length - 1;
        System.out.println("last value: " + numbers[lastNum]);
        System.out.println("array length: " + numbers.length);


        int min = numbers[0];
        for (int i = 1;i<numbers.length;i++){
            if(min>numbers[i])
                min=numbers[i];
        }

        System.out.println("minimum value: " + min);

        if(numbers.length > 2){
            int x = numbers.length/2;
            System.out.println("middle value " + numbers[x]);

        }else{
            System.out.println("cant print middle values");
        }

        System.out.print("even numbers: ");
        for (int i = 0; i<numbers.length;i++){

            if(numbers[i] % 2 == 0) {
                System.out.print(   numbers[i] + " ");
            }
        }

        System.out.print("odd numbers: ");
        for (int i =0;numbers.length > i;i++){
            if(numbers[i] % 2 != 0){
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.println();

        int  amount = 0;
        for (int i = 0;numbers.length > i;i++){
            amount += numbers[i];
        }
        System.out.print("amount։ " + amount);
        System.out.println();
        System.out.println("arithmetic mean: " + amount/ numbers.length);


    }
}
