package day40_abstractClass;

public abstract class HToyota extends GAraba{

    //parent taki marka yı override ederek guncelledim.

    @Override
    public String marka() {
        return "Toyota";
    }

    //şimdi toyota ya özel bazı kurallar koyacagım

    public abstract void model();

    public abstract void uretimYeri();











}
