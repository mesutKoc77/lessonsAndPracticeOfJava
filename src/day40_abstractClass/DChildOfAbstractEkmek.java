package day40_abstractClass;

public class DChildOfAbstractEkmek extends CAbstractEkmek{  //CAbstractEkmek class ını abstract classın olarak kabul edeceksen
    //abstract olan methodu da mecbursun kendinde oluşturmaya. yoksa olmaz dedi ve ben de ordKİ ZROUNlu methodu aldım yapıştırdım.



    @Override
    public void un() {
        System.out.println("Cevizli ekmek kepekli undan yapılır");
    }

    @Override
    public void maya() {
        System.out.println("Cevizli ekmekte binde 2 oraninda maya kullanilir");

    }

    @Override
    public void bicim() {
        System.out.println("Cevizli akmek somun ekmek seklindedir");

    }

    @Override
    public void gramaj() {
        System.out.println("Cevizli ekmek icin gramaj 650 gr.");
    }

    public static void main(String[] args) {
        DChildOfAbstractEkmek ekmek1=new DChildOfAbstractEkmek();
        ekmek1.bicim();
        ekmek1.gramaj();
        ekmek1.un();
        ekmek1.maya();

    }


}
