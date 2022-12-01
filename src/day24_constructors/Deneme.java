package day24_constructors;

public class Deneme {
    String isim = "John Doe";
    int yas = 40;

    public Deneme() {
        isim = "Seher";
    }

    public Deneme(String isim, int yas) {
        this(); //yani parametresiz constructor i çağırdı o da isim = "Seher"; demişti
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Deneme{" +
                "isim='" + isim + '\'' +
                ", yas=" + yas +
                '}';
    }

    public static void main(String[] args) {
        Deneme obj1 = new Deneme();
        Deneme obj2 = new Deneme("Fatih", 35);

        System.out.println("iisim :" + obj1.isim);
        System.out.println(obj1.yas);// obj 1 parametresiz cons. kullandı ve parametresiz cons. içinde ayrı bir yaş
        //ataması olmadıgından instance yani class level daki yaş ın default value sunu aldı.
        //ismi için ise ayrıca bir deger ataması oldugundan yani override edildiginden onu aldı


        System.out.println("yas:" + obj2.yas);
        //burda ise obj2 evet Deneme class ından bir obje olarak oluştrurulmuş. eşitliğin solu bize ilgili
        //class daki variable lari kullan, eşitliğin sagı ise hangi parametreyi kullanacagımı veriir.
        //String+int degerler girildiginden constructorı buymuş dyecegım ve constructor ın tanımlaması içinde de
        //diyor ki benim atadıgım yaş, instance variable in yeni degeridir.
        //cunku this.yas deyip kendisindenki int degeri parametre olarak atadıggı için artık class level daki
        //int override edilmiş oldu.

        System.out.println(obj2);
        //Deneme{isim='Seher', yas=35}
        //eger obj2'nin içinde parametresiz constructor olmamış olsa idi bu durumda default olan
        //isim = "John Doe"; yazacakti.
    }


}
