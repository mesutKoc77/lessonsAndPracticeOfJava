package day46_Maps;

import day44_maps.ReusableMethods;

import java.util.HashMap;
import java.util.Map;

public class C04_Maps {
    public static void main(String[] args) {

        Map<String,Integer> ornekMap=new HashMap<>();
        ornekMap.put("a",3);
        ornekMap.put("b",1);
        ornekMap.put("c",2);
        ornekMap.put("d",5);
        System.out.println(ornekMap);//{a=3, b=1, c=2, d=5}
        ornekMap.put("b",7);//put methodu olsa da olmasa da direkt ekler bakmaz ve yeni degeri 7 yaptı.

        ornekMap.putIfAbsent("a",7);//a yoksa a=7 yap dedi; ama a var oldugundan eklemedi.
        ornekMap.putIfAbsent("e",3);//e yoksa e=3 yap dedi; evet e yok ve e=3 yaptı
        System.out.println(ornekMap);//{a=3, b=7, c=2, d=5, e=3}

        ornekMap.put("g",3);//direkt ekledi
        ornekMap.put("a",2);//var oldugu için value sini degiştirdi.

        ornekMap.putIfAbsent("c",5);//yoksa koy diyor ama ben de var oldugundan hiç karışmayacak
        System.out.println(ornekMap);//{a=2, b=7, c=2, d=5, e=3, g=3}

        ornekMap.putIfAbsent("h",4);//yoksa h yi ekle dedi ve olmadıgından ekledi.

        System.out.println(ornekMap);//{a=2, b=7, c=2, d=5, e=3, g=3, h=4}
        
        ornekMap.compute("a",(k,v)->2*v);//key i a olan map in value sini 2 ile çarpip 4 yapacak.

        System.out.println(ornekMap);
        //{a=4, b=7, c=2, d=5, e=3, g=3, h=4}

        System.out.println(ornekMap.get("a"));//4//key i "a" olan map in value sini 4 yap.

        ornekMap.computeIfPresent("c",(k,v)-> 20);//c=20 yaptı.
        ornekMap.computeIfPresent("k",(k,v)->30);//k olmadıgından manıpule de etmedi. ve eklemedi.
        System.out.println(ornekMap);//{a=4, b=7, c=20, d=5, e=3, g=3, h=4}

        ornekMap.computeIfAbsent("c",v->15);//c yoksa dedim ama var oldugundan işlem yapmadı hiç
        ornekMap.computeIfAbsent("a",v->8);//a vardı zaten o yuzden şart saglanmadıgından direkt iptal etti.
        ornekMap.computeIfAbsent("m",v->12);//m key i olmadıgından value sini 12 yaptı.
        System.out.println(ornekMap);//{a=4, b=7, c=20, d=5, e=3, g=3, h=4, m=12}




    }
}
