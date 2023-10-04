package homework1.dynamicarray;

public class Test {
    public static void main(String[] args) {
       int[] array = {5,9,7,8,4};
       int index = 3;

        int[] proxyArray = new int[array.length - 1];

        for(int i = 0,k=0; i < array.length;i++){
            if (i == index){
               continue;
            }
            proxyArray[k++] = array[i];

        }
        array = proxyArray;

        System.out.println(array[3]);

    }
}
