package day38_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_ParentChildExceptions {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        /*
        eger oluşabilecek exceptions lar arasında parent child ilişkisi varsa, exception yakalama ihtimail çok fazla
        olanın yazılması daha anlamlıdır. yani parent yazılır child in yazılmasına gerek yoktur.

        illa ikisini de yazmak istersek, once child(yani exception yakalama imkanı az olan) yazılmalı yoksa ikincinin
        çalışma imkanı yoktur.

        bunu daha iyi anlayabilmek için C04 class ından yardım alınabilir.

        throws keyword u ile bizim exception ın farkında oldugumuzu java ya soyleriz. kodun çalışmasına engel olmaz.

         */

        String path="src/day37_Exceptions/TextFile";

        FileInputStream fis=new FileInputStream(path);

        int k=0;

        while ((k= fis.read())!=-1){
            System.out.println((char)k);
        }

/*
hoca normalde bunların sıralamasını başka derste public static void main(String[] args) throws FileNotFoundException, IOException {
bu şekilde anlattıgı için ben de bu sırayla yazdım ama derste;
tam dersi siralamasını yapmıştı.

fakat açıklamalara bakıldıgında şuan ki durumun dogru oldugu anlaşılıyor.
 */



    }







}
