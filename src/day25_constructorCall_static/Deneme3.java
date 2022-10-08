package day25_constructorCall_static;

public class Deneme3 {
    String isim="John Doe";
    int yas=40;

    public Deneme3() {
        String isim="Olcay"; //constructor ın içinde instance variable olmaz. ınstance lar genelde class level de olur.
        System.out.println("isim:"+isim);
    }

   public Deneme3(String isim){
        this.yas=30;
       System.out.println("isim:"+isim);

   }
   public Deneme3 (String isim, int yas){
        this("Murat");
        this.yas=45;
   }
   public void Deneme3(){
       System.out.println(isim);
   }

   public static void main(String[] args) {
        Deneme3 obj1=new Deneme3("Esra");
       System.out.println(obj1);//Deneme3{isim='John Doe', yas=30}
    }

    @Override
    public String toString() {
        return "Deneme3{" +
                "isim='" + isim + '\'' +
                ", yas=" + yas +
                '}';
    }
}
