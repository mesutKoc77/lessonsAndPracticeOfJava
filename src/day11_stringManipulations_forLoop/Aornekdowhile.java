package day11_stringManipulations_forLoop;

import java.util.Scanner;

public class Aornekdowhile {
    public static void main(String[] args) {
        /*
        whike loop larda dikkat et netxt ()kullanırsaN ALTINDA MUTLAKA NEXT LİNE KULLAN
         */

            Scanner scan = new Scanner(System.in);
            String tercih = "";
            do {
                System.out.println("Lutfen kelimeyi giriniz");
                String kelime = scan.next();
                scan.nextLine();
                System.out.println("Lutfen cumle giriniz durdurmak için 1 e basınız");
                String cumle = scan.nextLine();
                int ilkIndexBenim = cumle.indexOf(kelime);
                int ikinciIndex = cumle.lastIndexOf(kelime);
                if (!cumle.contains(kelime))
                    System.out.println("kelime yok");
                else if (ilkIndexBenim == ikinciIndex)
                    System.out.println("bir adet var");
                else
                    System.out.println("birden fazla");

                System.out.println("0-Exit, 1-Continue");
                tercih = scan.next();
                scan.nextLine();
            } while (!tercih.equals("0"));
        }

    }

