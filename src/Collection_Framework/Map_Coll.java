package Collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class Map_Coll {

    public static void main(String[] args) {
        Map<String,String> language=new HashMap<>();
        language.put("1","Delhi");
        language.put("2","Mumbai");
        language.put("3","Jaipur");
        language.put("4","Gurugram");
        language.put("5","Pune");
        language.put("2","Bandra");
        //System.out.println(language);
        language.remove("2");
        if (language.remove("5","Pune")){
            System.out.println("Key-Value Pair removed");
        }
        else {
            System.out.println("Not removed");
        }
        System.out.println("=========================================================================");

        for (String key:language.keySet()){
            System.out.println(key+" : "+language.get(key));
        }

    }
}
