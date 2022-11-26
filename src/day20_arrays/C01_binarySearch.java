package day20_arrays;

import day19_arrays.C04_ElementArama;

import java.util.Arrays;

public class C01_binarySearch {


    public static void main(String[] args) {
        // verilen bir arrayde istenen elementin
        // olup olmadigini kontrol etme

        String[] arr = {"Fatih", "Muhammet", "Jacob", "Dalyan", "Bora", "Esra", "Naci"};

        String arananElement = "Muhammet";

        C04_ElementArama.aranilandeger(arr, arananElement);

        //java da da bir arama motoru vardır.

        System.out.println(Arrays.binarySearch(arr, arananElement));//-7

        C04_ElementArama.aranilandeger(arr, "Dalyan");//1
        System.out.println(Arrays.binarySearch(arr, "Dalyan"));//3

        /*
        binarysearch bir array de aranan elementin indexini veirir.
        ama once sort yapılmalı.
        bınary yapmadan once sort yapmazsan sonucn ne oldugunu bilemeyiz. dogru da olabilir yanlısş da.
         */
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[Bora, Dalyan, Esra, Fatih, Jacob, Muhammet, Naci]
        C04_ElementArama.aranilandeger(arr, "Fatih");//1 adet var ve
        System.out.println(Arrays.binarySearch(arr, "Fatih"));//3. index de.

        /*
        peki ya olmayan bir index i aratırsak. eksi olmadıgını gösteriyor.
        olmayan element arandıgında sistem soyle çalışıyor;
        onceo element ilgili array da olsa kaçıncı SIRADA olurdu onu soyler ve başına eksi koyarak da
        olmadıgını belirtir.
         */
        //[Bora, Dalyan, Esra, Fatih, Jacob, Muhammet, Naci]
        System.out.println(Arrays.binarySearch(arr, "Gursel"));//-5//yani olsaydı 5. sırada olurdu.
        System.out.println(Arrays.binarySearch(arr, "Sukran"));//-8//yani olsaydi en son da yani 8. olurdu.
        System.out.println(Arrays.binarySearch(arr, "Ahmet"));//-1//eger 0 kullanılsaydı yani index kavramı kullanı
        //lsaydı sıfırıncı index e gelecek başına eksi koyacaktı bununda matimatiksel bir karşılığı yoktur.
        //dolayısıyla index kullanılmadı. direkt sıra kullanıldı.

        //binarysearch, olursa index yazar ama yoksa sayıyı belirtir. vardı 5. index der yoksa 6. sıra der ve başına
        //eksi koyar.


    }


}
