package day20_arrays;

public class C06_MDASoru {
    public static void main(String[] args) {

    // Verilen 2 katli MDA'de
    // element olarak bulunan cift sayilari toplayip yazdirin

    int[][] arr= {{1,2,3,4} , {3,4,2}, {2,4}};

        int ciftlerinToplami=0;


        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]%2==0){
                    ciftlerinToplami+=arr[i][j];
                }

            }

        }
        System.out.println(ciftlerinToplami);
        //method ile yapsaydık
        int[][] arr2= {{10,12,28} , {3,5,7}, {9,11}};
        ciftlerintoplami(arr2);

    }
    public static int ciftlerintoplami(int[][] array){
        int ciftlerinToplami=0;

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if (array[i][j]%2==0){
                    ciftlerinToplami+=array[i][j];
                }

            }

        }
        System.out.println(ciftlerinToplami);

        return ciftlerinToplami;

    }

}
