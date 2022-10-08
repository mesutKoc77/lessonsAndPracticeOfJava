package day41_interfaces;

public interface I06_Interface {
    /*
    bir interface de bodysi olan bir method olur mu?

     */
    /*
    interface lerde concrete method olmaz.
    tum methodlar public ve abstract tır.

    interface e sonradan bir abstract method eklenirse ona baglı tum child class lar bunu override etmeli yoksa hata
    veriri.

    sonradan eklenen bu abstract için child class ların tamamı buna uymasın diye java buna bir istisnA getirmiştir.

    java demiş ki tmm ekleyebilirisn ama static veya default keyword lerini kullanarak body oluştturabilriisin ve
    isteyen child class bunlaerı kullanabilir demiştir.(znotlar class ının 6. sıradakine beakabilrisn)

    buradaki default access modifier degildir bundan doalyı public ile kullanılabiliyor

    bu istisnasi durum için kullanılan iki keyword arasaındaki fark şudur:

    default ile oluşturlan methoda obje ile ulaşabailirz.
    static olan methoda da static yontemle ulaşabilriiz.


     */

    void method1();//bu method zzaten public ve abstractır.I03 de bahsetmiştik
    public default void method2(){
        System.out.println("interface defaukt method");
    }
    public static void method3(){
        System.out.println("interface static method");
    }








}
