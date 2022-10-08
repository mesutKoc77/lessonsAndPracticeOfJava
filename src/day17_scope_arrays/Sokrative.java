package day17_scope_arrays;

public class Sokrative {




    public static void main(String[] args) {
        /*int num=1;//1 den başla


        while (num<3)//num 3 den kucuk oldugu muddetce
        {
            System.out.print(num+" ");
            num++;
        }
        */

        /*int num=1;
        while (num<1){
            System.out.println(num +" ");
            num++;
        }
        burada program çalışır loop çalışır ama loop body si çalışmaz.
         */


        //soru 1
        /*int num=1;
        while (num=1) //num yukarıda 1 iken, num 1 olana kadar aşağıyı yaz demek cte verdirir. ama num==1 deseydik olurdu.
        {
            System.out.println(num+" ");
            num++;

        }

         */
        /*
        for (int i = 0; i < ; i++) //burda ilk loop da i 0 dan başlar ve donunce bir arttırım yapılır, yoksa başlangıçta
            //hemen bir arttırıp devam etmez. bir den başlar donerken bir arttırır ve yoluna devam eder.
        {}

         */

        //char ifadeler matimatiksel işlemlerde işleme giriyorsa aski degerleriyle işleme giriyor.
        System.out.println('a'+'b'+'c');//toplama yaptık
        System.out.println("a "+ "b "+"c ");//harfleri yanyana yazdırmak isteseydik string yapar devam ederdik.

        char ch='a';
        while (ch<'d')//burda gelecek a nın sayısal degeri aski karşılıgı 20 olsun, 20 kucuktur b, b nin de
            //aski degeri 30 olsun, 20 kucuktur 30 oldugundan loop donecektir.
        {
            System.out.print(ch+" ");
            ch++;
        }

        /*int product=1;
        int num=1;
        while (num<5){
            product=product*num;
            num++;//burda surekli num ın arttırlması gerekiyor, yoksa hep baştaki degerde kalırdı.
            product++;
        }
        System.out.println(product);

         */

        int num=1;
        do//şart yok dolayısyla hemen yaz  while gprene ve while da ki şartı saglayna  kadar.
        {
            System.out.print(num+" ");
            num++;
        } while (num<4);















    }





}
