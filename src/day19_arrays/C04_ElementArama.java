package day19_arrays;
public class C04_ElementArama {
    public static void main(String[] args) {
        // Soru 4- Verilen bir array’de
        // istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdiran bir method olusturun.
        String[] array= {"A","G","F","A","K","F","F"};
        String arananElement="F";
        aranilandeger(array,"F");

    }

    public static void aranilandeger(String[] arr,String aranilandeger){
       int kacadetvar=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].equals(aranilandeger)){
                kacadetvar++;
            }
        }
        if (kacadetvar==0){
            System.out.println("ilgilidegeryoktur");
        } else {
            System.out.println("aranılan deger "+kacadetvar+" adet vardir");
        }
   }
}



