package homework1.dynamicarray;

public class DynamicArray {

    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    public int[] array = new int[10];
    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    //ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend()


    public void add(int value) {

        if(size > array.length){
            extend();
            //և ավելացնենք


        }

            array[size++] = value;

        }




    //3․ հին մասիվի հղումը կապենք նոր մասիվի հղման հետ։


    public void extend() {
        //1․ ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
        int[] array2 = new int[20];

        //int element = -1;
        //element++;
        //2․ քցել հին մասիվի էլեմենտները նորի մեջ
        for (int i =0;i<size;i++) {
            //element+=1;
            array2[i] = array[i];
            //System.out.println(array2[element]);
        }

        array = array2;


    }

    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վերադարձնել
    // մասիվի index-երրորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {

        if(array.length > index){
            return array[index];
        }
        else{
            return -1;
        }
    }

    //տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

        }

    }


