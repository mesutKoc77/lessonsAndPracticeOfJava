package day19_arrays;

public class C01_ElemanlariToplama {


    public static void main(String[] args) {
        // Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method yaziniz.

        int[] arr = {3, 5, 7, 10, -5, 0};

        int sonuc = elemanlariTopla(arr); //sayı oldugu için dataturu int olacak, int yazdım ve variable ımın ismi sonuc
        //oldu, daha sonra method ismini verdim ve argument imide arraye karşılık gelen arr yaptım ve java bize
        //otomatik olarak method oluşturucak.
        System.out.println("array'deki pozitif elementlerin toplami" + sonuc);



    }

    public static int elemanlariTopla(int[] arr) {

        int toplam = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                toplam += arr[i];
            }

        }
        return toplam;//toplamı da sonuc olarak bana dondurecek.


    }

      /*
    once method, method un sonucu int yani return u int, parametreleri array oalcak.
    amacı sayıların toplamı ama bu sayılar poztiif ise
     */
}


