package homework1;

public class Sort {
    public static void main(String[] args) {

        int[] arr = {4,3,1,2,6,0,5};
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Swap arr[i-1] and arr[i]
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

      for (int i : arr){
          System.out.println(arr[i]);
      }

    }



}
