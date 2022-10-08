package day35_overriding;

public class FChild extends EParent{

    /*
    code, generate bolumune gelerek override yapılabilir.
     */

    @Override//notasyon
    void method1() {
        System.out.println("Child method1");

    }

    @Override
    void method2() {

        System.out.println("Child method2");


    }

    /*
    istersek intellij bziizm yerimeiz override oluşturabilri, code
    menusunden generATE seçip override methodu secilebilir.
    bu drumda intallij  @Override notasyonu kullanır ama kullanmak
    mecburi degildir. kullanmakta fayda vardır. Çünkü:

    cunku @Override notasyonu kullanılırsa iki method u gözetim
    altında tutar.
    yani overridden silinirse,  CTE verir.

     */




}
