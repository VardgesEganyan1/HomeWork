package homework1;

public class ForExamples {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            System.out.print(i);
            if (i < 1000) {
                System.out.print("-");
            }
        }

        for (int i = 0; i <= 100; i++) {

            if ((i % 2) == 0) {
                System.out.println(i);
            }

        }

        int[] array = {2, 5, 8, 4, 9, 3, 7};
        int max =array[0];
        for (int i = 0; i < array.length; i++) {

            if( array[i] > max) {
                max = array[i];

            }



        }
        System.out.println("maximum value " + max);
    }
}
