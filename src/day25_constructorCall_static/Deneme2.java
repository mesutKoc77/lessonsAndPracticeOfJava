package day25_constructorCall_static;

public class Deneme2 {
    String isim="John Doe";
    int yas=40;

    public Deneme2(){
        isim="Seher";
        System.out.println("isim:"+isim);
    }
    public Deneme2(String isim ){
        this();
        this.yas=30;
        System.out.println("isim:"+isim);// bu scope da isim variable ı var mı? var. degeri de Esra o zaman onu yazdırır
        //class level a gitmez.
    }
    public Deneme2(String isim  , int yas  ){
        this("Murat");
        this.yas=45;

    }

    public static void main(String[] args) {
        Deneme2 obj1=new Deneme2("Esra");
        Deneme2 obj2=new Deneme2("Fatih",35);
        System.out.println(obj1);//Deneme2{isim='Seher', yas=30}
        System.out.println(obj2);//Deneme2{isim='Seher', yas=45}
    }

    //nıot this yazılamamışsa hemen scope da ilgili variable varsa ona atama yapılır.
    //her bir suslu parantezin içi her zman bitirilir oyle devam ediliir.










    @Override
    public String toString() {
        return "Deneme2{" +
                "isim='" + isim + '\'' +
                ", yas=" + yas +
                '}';
    }


}
