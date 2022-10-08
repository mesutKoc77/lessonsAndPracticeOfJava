package day19_arrays;

import java.util.Arrays;

public class C08_ElemanlariKaydirma {

    public static void main(String[] args) {
        // Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip,
        // sondaki elementi de basa tasiyacak bir method olusturun,
        // array’i yeni haliyle kaydedin.
        // Orn :  input : [4,5,6,7]   array’in son hali. : [7,4,5,6]

        int[] arr = {4, 5, 6, 7};
        //once arrayın son elemntini geciici depoya alalım

        int temp=arr[arr.length-1];

        /*
        3. ındeksin deeri ikinci nin deeri olsn

        arr[3]=arr[2]
        arr[2]=arr[1]
        arr[1]=arr[0]
         */

        //kodu yazmadan once ne yapmak istedigimi yukarı yazdım ve kodumu da buna göre ayarladım.

        for (int i = arr.length-1; i >0 ; i--) {
            arr[i]=arr[i-1];
        }
        //loop bittikten sonra da gececi depomdaki degeri de ilk index ime atayacagm

        arr[0]=temp;

        System.out.println(Arrays.toString(arr));

        int[] yenideger = {10, 11, 12, 13};

        /*herbirini bir saga kayrdı ve sondakini başa aktar.

         */
        //once sondaki bir yere alalım

        int sondeger=yenideger[yenideger.length-1];

        //şimdi ise ne yapmak istiyorsam once onu bir yapısal olarak kuralım

        /*
        yenideger[3]=yenideger[2]
        yenideger[2]=yenideger[1]
        yenideger[1]=yenideger[0]
         */
        for (int i = yenideger.length-1; i >0 ; i--) {
            yenideger[i]=yenideger[i-1];
        }
       yenideger[0]=sondeger;

        System.out.println(Arrays.toString(yenideger));

        //method oluşturma ile yapsak?
        int [] methodlakayrdirma={83,84,85,86,87,88,89};

        kaydirma(methodlakayrdirma);

        //yeni ornek ama stringle
        String[] stringarray= {"Ahmet","Gel" ,"Çay","İçelim"};

        kaydirmastring(stringarray);

        //peki method oluştururken direkt aşağıdan başlıyprduk şimdi buradan başlasak?
        //ve bizi aşağıya yonlendirerek nasıl yaoardı?
        //sonucumuz ne yine stringarray ii çevirme ve deger olarak yine stringarrayi alacagz

        stringarray=sagakaydir2(stringarray);//bak normalde direkt aşağıda tek tek yazıyorduk. data turu ne oalcak
        //ve sonuc olarak bana ne dondurecek ama biz burda hem sonucu yazdık heö de giriş degerleri


    }//peki bunu method oluşturma ile nasıl yapardım?

    public static String[] sagakaydir2(String[] stringarray) {
        String sondegerimiz=stringarray[stringarray.length-1];
        for (int i = stringarray.length-1; i >0 ; i--) {
            stringarray[i]=stringarray[i-1];
        }stringarray[0]=sondegerimiz;

        System.out.println(Arrays.toString(stringarray));
        return stringarray;

    }

    public static int[] kaydirma( int[] birarrayalalim)//burda sariya boyamasının nedeni deger int, sonuc da int
    //normalde sen bunu int, int oldugundan void ile yapabilridin. ama int girip String olsun isteseydin
    //sarı da kalkardı." bu benim notum teyit edilmeli yine de emin degilim"
    {

        int sondegerdepoda=birarrayalalim[birarrayalalim.length-1];
        for (int i = birarrayalalim.length-1; i >0 ; i--) {
            birarrayalalim[i]=birarrayalalim[i-1];
        }birarrayalalim[0]=sondegerdepoda;

        System.out.println(Arrays.toString(birarrayalalim));
       return birarrayalalim;

    }
    public static String[] kaydirmastring( String[] birarrayalali) {

        String sondegerdepoda=birarrayalali[birarrayalali.length-1];
        for (int i = birarrayalali.length-1; i >0 ; i--) {
            birarrayalali[i]=birarrayalali[i-1];
        }birarrayalali[0]=sondegerdepoda;

        System.out.println(Arrays.toString(birarrayalali));
        return birarrayalali;

    }





}
