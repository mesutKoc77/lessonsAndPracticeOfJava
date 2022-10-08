package day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C11_indexOf_lastIndexOf {
    public static void main(String[] args) {
        List<String> liste=new ArrayList<>();
        liste.add("Fatih");
        liste.add("Esra");
        liste.add("Levent");
        liste.add("Esra");
        liste.add("Seher");

        System.out.println(liste.indexOf("Esra"));//1.index yani baştan aramaya başladı.
        System.out.println(liste.lastIndexOf("Esra"));//aramaya sondan başlayıp tabii ki index sayımını da baştan
        //başlayarak devam ettirecek.//3//sondan aramaya başladı ve bulduktan sonra index ini soyle.

    }
}
