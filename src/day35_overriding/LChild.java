package day35_overriding;

public class LChild extends KParent{

 /*
 mesela, method1 ın access modifier ı default iken aşağıdaki
 mehod 1 private olamaz.
 yani default, protected ve public olabilir ama private ola-
 maz.
  */




    @Override
    void method1() {

    }

    @Override
    /*
    parent taki method 2 protected child daki ise default
    yani ondan daha dar, dolayısyla kabul edilemez.
    protected veya public olabilir ama.
     */
    protected void method2() {

    }


    /*
    Kural2:
    child class taki overriding methodun access modifier i
    parent taki access modifier dan daha kısıtlayıcı olamaz.
    yani çocuk babayı kısıtlayamaz.
     */







}
