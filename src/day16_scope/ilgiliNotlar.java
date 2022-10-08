package day16_scope;

public class ilgiliNotlar {






    public static void main(String[] args) {
        //bir variable oluşturuldugu method un kapsamı dahilindedir baasşka bir yerde kullanılamazlar bunlara local level
        // variable   lar denilir. class level vaiable lar
        //ın scope ise tum class tır. method ve kod blolklarının dışında oluşturulurlar.
        /*
        x methodu içerisnde oluşturlan herhangi bir variable y metdodu içerisidne çağıralamazlar. yalnzca kendi scope u
        içerisinde çağırılabilirler. herkes kendi mahallerisnde otecek.
        eger methodun içeirisnde bir loop var ve bunloop un içeirisndeki variable ı method un içeirisnde kullanmak istesen
        dahi, java buna izin vermez cunku bunun adı localin de locale i variable ıdır. sadece ilgili loop un içerisidne
        bu loop u kullanabilirsin.yani loop variable ının scope ları oluşturudukları loop tur.ü

        bir hastane dusunelim. doktorun boyu adı kilos tc si vb özellikleri veya hemsşire nin adı boyu kilosu tc si gibi
        özellikleri için bir obje oluşturmak gerekiyor ve bu kapamda deger atamsı yapılmalıdır. ama ortak kullandıkları
         isimler de yani sabit bilgilerde vardır. ornegin çalıştıkları hastanenin adı, adresi vb.
         bu b,lgiler biizm variabel ın static mi instance mı olarak belirleyecegımızın kaynagı olacak.
         herkes için aynı ise static kişiye özel olacaksa instance olacak. herbir obje ye özelse instance, geneli kapsyırsa
         static olur. class level de olşuturusun bunları da.

         bir obje oluşturdugumuzda, java gider tüm instance lardan birer kopya oluşturur ve bu obje ile ilişkilendirir.
         her bir obje oluşturulması duurmu için de bu gecerlidir.

         */

    }





}
