package day16_scope;

public class C01_Scope {
    //class level demek, class ın içinde ama tüm methodların dışında...yani bu bölge.
    //ornek
        static int s1=12;//şimdi bunu main method veya diger methodların içerisinde yazdırıym ve java itiraz etmiyor.
    //ama şöyşe bir durum var her bir method da cağırabilriin fakat java önce main method a gidecek ve ondakini yazdıra
    //cak ve daha sonra konuyu kapatacak, aşağıya hiç inmeyecek. yani yukarıda başka bir method dahi olsa, java main de
    //varsa yazdıracak yoksa yazdırmayacak.



    public static void main(String[] args) {
        /*
        1- bir metdodun içerisnde oluşturulan ornegın main in içerisnde oluşturulan bir variable aşapıda void de DİREKT
        çağırılamaz. yani main method un scope unda olanla ancak çağırma işlemi yapılabilir.
        ;ama biz yine class içersinde oluşturudgumuz variable ı yine ilgili scope dışında da çaşğırmak istiyorsak
        bu durumda, ilgili varible ı class level da oluşturururz.
        class level şu: class ın içinde ama hiçbir method a ait degil.
        bu class levelleri da hemen class ın altında süslü parnatezden hemen sonra kayıt ederiz.

         */
         /*
          Java'da scope hangi variable'in nereden kullanilabilecegini
          yada hangi satirda hangi variable'lari kullanabilecegimizi
          belirleyen kurallardir.

          bir variable'in scope'undan bahsedersek
          o variable'in nerelerde kullanilabilecegini konusmamiz gerekir

          bir method icin scope'dan bahsedersek
          o method icerisinde kullanilabilecek variable'lardan bahsederiz

          1- bir method'un icerisinde olusturulan variable baska method'da direk kullanilamaz

          Bu durumda class icerisinde tum method'lardan kullanilmasini istedigimiz
          variable'lari class level'da olustururuz.
         */

        System.out.println(s1);//class level dan çağırdı ve 12 yazdı.

    }

    public static void digerMethod() {

        String str="java";
        System.out.println(s1);//bunu yazıdrmadı çunku önce main e gitti aldı ve yazdırarak bitirdi.

    }


}
