package day13_forLoops_nestedForLoop;

public class C04_nestedForLoops {
    public static void main(String[] args) {
        //içiçe for loop oder i içe ternarty nested olarak adlandırılıyor. nest zaten yuva, küçük bir ev demek

        /*
         icice (nested) iki loop varsa
         outer loop her deger alddiginda
         inner loop bastan sona bir kez calisir. yani dıştaki deger bir kere degişsse içteki loop da burdan aldıgı
         deger cercevesinde yeniden deger alır.
         */


        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <=5; j++) {
                System.out.print(i*j+" ");
            }

            System.out.println(" ");
        }
        /*
        yukarıda for lar ın pazantrez içleri false olana kadar onların içi yazıdırılır. false olursa suslu parantezin içinde kala
        cak şekilde aşağıya inecek ve yazdıracak. yani en temel java kuralı neydi: BEN YUKARIDAN AŞAĞIYA İŞLEMLERİMİ YAPARIM.
        AYRICA TRUE BULDUGUMDA O İŞLEME DEVAM EDERİM, FALSE U GÖRDUGUM ANDA DA AŞAGIYA GİDER VE VAZİFEMİ İCRA EDERİM.
        FOR LOOP İÇİN SOYLERSEK AŞAĞIDA İŞİM BİTER VE TEKRARLAMAM GEREKLİ VAZİFELER VARSA YUKARI ÇIKAR, VE AŞAĞIYA DOGRU DEVAM
        EDERİM. ÖZELLİKLE SÜSLÜ PARANTEZ LER BENİM HER BİR İŞLEMMİM İÇİN SINIRLARI BELİRLİYOR. SÜSLÜ PARANTEZLER İŞLEM İÇİN
        SINIRI BELİRLER.
        yukarıdaki örnek te inner loop a şunu soyluyoruz suslu içindekini 5 kere tekrar et ve 5 dahil.
        onun da içine gidiyoroz onun için deki for a da senin içindekini beş kerer tekrar et diyoruz. ama tabii ki yukarıdan
        aşağıya kuralını uygulayarak devam ediyoruz.
         */



    }
}
