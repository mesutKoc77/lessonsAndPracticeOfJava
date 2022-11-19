package day19_arrays;

public class C10_EnUzunKelime {

    public static void main(String[] args) {
        // Soru 6- Verilen String bir array’deki
        // en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String[] arr = {"Fatih", "Bora", "Esra", "Naci", "Muhammet", "Jacob", "Dalyan"};
        //herhangi birisini enuzun ve enkısa kabul edelim.

        String enuzun = arr[3];//herhangi birisini sabit tuttum ve digerlerini buna göre kıyasladım.
        String enkisa = arr[3];

        for (int i = 0; i < arr.length; i++) //Esra yı aldık, fatih ile kıyasladım, fatih buyuk oldu ve enuzuna
        // atandı daha sonra bora fatih ile kıyaslandaı yine fatih, fatih naci ile kıyaslandı yine fatih,
        // fatihi muhammed ile kıyaslandı muhammet en uzun oldu, daha sonra muhammet jacob ile ve daha sobra
        //dalayn ile kıyaslandıg ama en euzun degişmedi

        {
            if (arr[i].length() > enuzun.length()) {
                enuzun = arr[i];
            }
            if (arr[i].length() < enkisa.length()) //burda esrayı aldık,fatih ile kıyasladnı, esra en kucuk, sonra
            // boraya gecti, bora en kısa oldu, daha sonra bora naci ile kıyaslandı naci en kısa oldu, daha sonra
            //muhammet ile kıyaslandı yine naci, jacob ile kıyaslandı yine naci ve en sona geldi dalyan ile kıyasl
            //andı yine naci oldu.
            {
                enkisa = arr[i];
            }

        }
        System.out.println("en uzun ise: " + enuzun + " enkisa ise: " + enkisa);

        //peki bunun method ile nasıl yapardım

        String[] deneme = {"Al", "Kirmizi", "Ahmet", "Sezginbaran"};
        enkisaveenuzun(deneme);

    }

    //peki bunun method ile nasıl yapardım
    public static void enkisaveenuzun(String[] array) {

        String enuzun = array[1];
        String enkisa = array[1];

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > enuzun.length()) {
                enuzun = array[i];
            }
            if (array[i].length() < enkisa.length()) {
                enkisa = array[i];
            }

        }
        System.out.println("en uzun ise: " + enuzun + " enkisa ise: " + enkisa);

    }

}





