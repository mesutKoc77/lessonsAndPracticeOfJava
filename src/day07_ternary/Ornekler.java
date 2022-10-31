package day07_ternary;

public class Ornekler {
    public static void main(String[] args) {
        int a=10;

        System.out.println( a>10 ? " Sayi pozitif" : "değil");

        System.out.println(a>20 ? a*a : a++);//burda dikkatli olalım soutun onunda "a" oldugu için once a yı yazdırır
        //ve daha sonra da ++ geldipi için a yı bir attırarak a nın yeni değerini bir artı olarak belirler. Bu ornekte
        //once a gelmiş dolayısıla 10 yazıdırır ama daha sonra a nın yeni degerini de 11 yapar nitekim saglamasını
        //yapsak aşagıda bunu gormus oluruz.

        // System.out.println(a);

        System.out.println(a<100 || a<0 ? 3*a+1 : 2+a/5); //işte burda a yı 11 degeriüzerinden gprecegız. ve işleme
        //devam edecegız

        int x=10;
        int y=15;

        int z= a>0 ? y++ : --x; //burda pre ve post increment olayı dahıl oldu. yani önce atama yaptı ve y nin degerini
        //z ye atadı daha sonra ise y'yi bir arttırdı. dolayısıyla a>0 oldugumndan y++ yı kullandık ve y 15 idi bunu
        //z ye atadık ve y'yi de bir arttırarak 16 yaptık.

        System.out.println(x + ", " +y+ ", " +z);

    }
}
