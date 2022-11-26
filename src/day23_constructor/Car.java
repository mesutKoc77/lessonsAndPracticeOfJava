package day23_constructor;

public class Car {
    //obje oluştrmak için oluşturdugumuz için bu class da main method olmaz.

    int ilanNo;

    String marka = "deger atanmadi";

    String model = "deger atanmadi";


     @Override
    public String toString() {
        return
                "ilanNo:" + ilanNo +
                        ", marka:'" + marka + '\'' +
                        ", model:'" + model + '\'' +
                        ", yil:" + yil +
                        ", fiyat: " + fiyat;
    }

    //code, generate ile bu yukarıdakini yaparak(toString() ) bu class dan obje oluşturanlar direkt sout ile
    // gorebilecekler. Mesela CarRunner classı.




    int yil;

    int fiyat;


    //hepsi için ortak bir deger olmadıgı için yukarıdakileri instance olarak bıraktık.

    public void maxHiz(String yakit) {
        if (yakit.equalsIgnoreCase("benzin")) {
            System.out.println("Benzinli araçlar iiçin max hız 240 km/h");
        } else if (yakit.equalsIgnoreCase("dizel")) {
            System.out.println("Dizel araçlar iiçin max hız 260 km/h");
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            System.out.println("Dizel araçlar iiçin max hız 200 km/h");
        } else {
            System.out.println("Girilen yakit turu gecerli degil");
        }
    }

    //aşağıdaki parametreli cpnstructor denilir.
    public Car(int ilanNo, String marka, String model, int yil, int fiyat) {
        this.ilanNo = ilanNo;
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;

    }

    public Car() {

    }

    public void vites(String yakit) {

        if (yakit.equalsIgnoreCase("benzin")) {
            System.out.println("Benzinli araclar otomatik veya duz vites olabilir");
        } else if (yakit.equalsIgnoreCase("dizel")) {
            System.out.println("dizel araclar otomatik veya duz vites olabilir");
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            System.out.println("elektrikli araclar otomatik vites olabilir");
        } else {
            System.out.println("Girilen yakit turu gecerli degil");
        }
    }


}
