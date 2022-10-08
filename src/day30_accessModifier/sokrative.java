package day30_accessModifier;

public class sokrative {
    public static void main(String[] args) {
        /*1
        int [] arr={1,3,5};
        for (int deger:arr
             ) {
            System.out.print(deger+" ");
        }
        */

        /*2

        int [] sayi={1,3,5};
        int x=0;

        for (int eacg:sayi
             ) {
            x=x+eacg*eacg;
        }
        System.out.println(x);

         */

        /* 3

        int [][] array={{1,2},{3},{4,5,6}};
        int toplam=0;

        for (int [] each :array //yani burda array variable ın içindeki her bir array i getir diyoruz [] işaretini
                //göstererek.digerlerinde ise array in içindeki int veya string leri getir diyorduk. yani adım
                //ADIM gidecegız. bir iç de ne varsa onu alacagız.
             ) {
            for (int asama:each
                 ) {
                toplam=toplam+asama;
            }
        }
        System.out.println(toplam);

         */

        /*4

        int [][] array={{1,2,3},{4},{5,6}};
        System.out.println(Arrays.deepToString(array));//arraylerin yazım şekli//[[1, 2, 3], [4], [5, 6]]

        for (int [] each:array //---array ın içindeki her bir each int array i bana getir---
             ) {
            System.out.println(Arrays.toString(each)+" ");//[1, 2, 3] , [4] , [5, 6]
        }
        System.out.println(array.length);//3

        for (int [] w:array
             ) {
            System.out.print(w.length+" ");//3 1 2
        }
        System.out.println(Arrays.toString(array[0]));//[1,2,3]

         */

        /*5

        int []arr={12,21,13};

        for (int each:arr
             ) {
            System.out.print(each+" ");//12 21 13
        }
        int [] array ={12,21,13};
        for (int each2:array
             ) {
            System.out.print(each2+" ");//12 21 13
        }
        int [][]arr2={{12},{21},{13}};
        for (int [] asil:arr2
             ) {
            System.out.print(Arrays.toString(asil));//[12][21][13]//arrays to string demezsen referansını yazar.
        }

         */
        /*6

        int [] arr={1,3,5,7,9};

        for (int each:arr
             ) {
            System.out.print(each+" ");//1,3,5
            if (each>4){
                break;
            }
        }

         */

        /*7

        String s="purr ";
        s.toUpperCase();//buralarda hiç atama yok ve String ler ımmutable oldukaalrı için degiştrilenmez ve burada da
        //bunu uygulanmıs sekilde goruyoruz yani degiştirlemiyorlar. yeni bir deger e atasaydım o zaman degiştirebilrdim
        //array ve stringbuilder lar mutable idi.
        s.trim();
        s.substring(1,3);
        s+="two";
        System.out.println(s);//purr two
        System.out.println(s.length());//8

         */

        /*
        8 eşitliğin sagı ve solu aynı deger olmalı string ise string int ise int
        bu durumda
         */

        /*
        == sring in havuzda olup olmadıgına bakarark karar veriyor eger havuzda ise true yazar.
        ama equals ise direkt metinlere bakıyor ve havuzda olup olmadıgına bakmıyor.
         */













    }


}
