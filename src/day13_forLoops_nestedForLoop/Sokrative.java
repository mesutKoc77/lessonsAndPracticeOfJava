package day13_forLoops_nestedForLoop;

public class Sokrative {
    public static void main(String[] args) {


        for (int i = 5; i >=1 ; i--) //her zaman en sag dan başlar. 5 i aldı yazdırdı sonra aşağıda bir eksiltti
            //4 oldu sonra en sagdan başladı, en sag bir azalt dedi 4 oldu, bir saonraki saga geçti 4 nuyuk mu 1 den
            // evet dedi o zaman true dedi ve aşağıyı yazdırdı.
        {
            System.out.print(i+" ");
            i--;

        }

        for (char i = 'f'; i>'a'; i--) {
            System.out.print(i+" ");
            i--;

        }
        //ve java, yukarıdan aşağıya işlemlerini yapar.
        System.out.println(" ");
        System.out.println("ikinci index den ititbaren yazdırmanın forloop ile çözümü");
        String str="Java Guzeldir";//ikinci index den ititbaren yazdırmanın forloop ile çözümü

        for (int i =2; i <str.length(); i++) {
            System.out.print(str.charAt(i));

        }
        System.out.println(" ");

        System.out.println("ikinci ile altıncı index arasını yazdırma ");
        String str2="Java Guzeldir";//ikinci ile altıncı index arasını yazdırma forloop ile çözümü

        for (int i =2; i <6; i++) {
            System.out.print(str.charAt(i));

        }

















    }
}
