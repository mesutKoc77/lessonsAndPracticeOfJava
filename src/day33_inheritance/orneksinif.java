package day33_inheritance;

public class orneksinif extends ornekokul{

    int age;

    public orneksinif(int age) {
        super();//demiştik zaten, bir child class daki constructor da her zaman super constructor vardır.
        System.out.println("child class parametreli constructor");
    }

    public orneksinif() {
        this(11);//this yazdıgı için bulundugı clASS da ki int parametreli constructor ı uygularız.
        //normalde aslında burarda super constructor vardı ama manule olarak thıs constructor yazında super öldü.
        System.out.println("child class parametresiz constructor");
    }

    public static void main(String[] args) {
        orneksinif sinif1=new orneksinif();//orneksinif class ından parametresiz constructor kullanarak bir obje oluş-
        //turdum.
        /*
        "parent class constructor"
        "child class parametreli constructor"
        "child class parametresiz constructor"

         */
    }




}
