package day19_arrays;

public class C06_ElemanlariToplaMain {
    public static void main(String[] args) {
        // Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        //yazdırın.

        int[] arr = {3, 5, 7, 10, -5, 0};

        int toplamdegeri=0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>0){

            toplamdegeri+=arr[i];}

        }
        System.out.println("Arrayin pozitif elementleri Toplam Degeri"+toplamdegeri);

    }
}
