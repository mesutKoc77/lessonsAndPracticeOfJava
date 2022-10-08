package day32_encapsulation_inheritance;

public class Doktor extends Muhasebe {

    public static void main(String[] args) {


        /*
        insanlarda parent ler child edinir fakt java a durum farklıdır
        bir class kendi child class ını secemez ancak oınunla neleri paylaşabilecegını belirler.
        bunu da yani kendi child class ları benden ne alabilir veya neler paylaşabilirim onlarla sorusunun cevabını
        ancak protected variable data turu ile bunu belirleyebilirim.
        cunku java da class lar child edinmez, child lar parent edinirler.
        herhangi bir class da özelliklerini (yani var olan method ve variable) otomatik olarak sahiplenmek istedig
        iniz bir class varsa onları paretn edinebilrisiniz. mesela doktor lar class ı muhasebe deki bazı variable
        lara ıhtiyac duyacaksa doktor class ını muhasebe ye extend ederiz yani ondaki variable ları alarak geniş
        letiriz."extend"; muhasebe de ık de ki variable ları kullanacaksa o zaman da muhsebeyi ik ye extend ederek
        ondaki variable ları kullanırız.  burda o vvakit, doktor class ı da muhasebe yi parent edinmiş olur.

        baba, çocuk aile ilişkisi buna ornek verilebeilir. evinde tuz sa babandan git al, bir ustt katta zaten
        veya utun bzoulduysa uzaklara gitme babana sor onda varsa ondan al. baba da daha oncesinden kendi ozelini de
        beli,rlemeli protected ya da public yaparak evet paylaşırım demiş olurum ama private yaaprsam kimse kullanamaz.
           ya da dede ne de gidebilrisin

         */
        Doktor dr=new Doktor();//ben doktor class ından doktro oluştrudum. hastane ye yeni bir doktor geldi mesela
        dr.isim="Recep";
        dr.soyisim="Yilmaz";
        dr.raporluMu=false;
        dr.sgkNo="135256665";
        dr.minSaatUcreti=25;
        System.out.println(dr.standartMaas());//6000=30*25*8




    }
}
