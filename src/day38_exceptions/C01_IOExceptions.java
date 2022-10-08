package day38_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOExceptions {
    public static void main(String[] args) throws FileNotFoundException {

        String path="src/day37_Exceptions/TextFile";
        //dosyaya ulaşmak istersen Fileınputstream e ihtiyacın var
        FileInputStream file=new FileInputStream(path);//java diyot ki benden onu almamı okumamaı istiyorsun ama çeşitli
        //nedenlerden oturu ya okuyamazsan diyerek hata veriryor. bu durumda bir expection ekledik class isminin başına
        /*
        throws FileNotFoundException
        bunu ekleyerek cte yi kaldırdık ama bu yani method signature ına ekledigimiz bu throws sadece bilgi vermek amacını
        taşımaktadır.
        bu aslında try catch deki gibi exception ı handle yani cevrelemez. Sadece biz java ya şunu demiş oluyoruz.
        sen bir prblemle karşılaşrsan sorumluluk bizde sen exceptionı fırlat.

         */








    }
}
