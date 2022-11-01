package day08_switchStatements_StringManipulation;

import java.util.Scanner;

public class ornek {
    public static void main(String[] args) {
        /*
        Kullanıcıdan gun ismini alın,
        ver griilen gun ismine gore tatilMi variable ını haftasonu için true,
        haftaiçi için ise false olarak atayın.
         */

        Scanner scanedilen=new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");
        String gunIsmi=scanedilen.next().toLowerCase();

        boolean TatilMi=false;

        switch (gunIsmi) {
            case "pazartesi" :
            case "salı" :
            case "çarşamba" :
            case "perşembe" :
            case "cuma" :
                TatilMi=false;
                break;

            case "cumartesi":
            case "pazar":
                TatilMi=true;
                System.out.println("yazdıgınız gun" +gunIsmi);

        }


    }
}
