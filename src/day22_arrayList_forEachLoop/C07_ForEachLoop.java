package day22_arrayList_forEachLoop;

public class C07_ForEachLoop {
    public static void main(String[] args) {
        //verilen bir arrayin tum elemntlerini yazdıralım

        int[] arr = {2, 3, 4, 5, 6};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        /*
        for each loop ise index(sıra) kullanamdan array ve list gigbi yapıların tum elementlerini bize geittirir
          */
        System.out.println("");

        for (int eachloop : arr)//arr degiskenindeki her bir integer i...
        {
            System.out.print(eachloop + " ");

        }


    }


}
