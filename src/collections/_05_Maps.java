package collections;

import java.util.HashMap;

public class _05_Maps {
    public static void main(String[] args) {
        /*
        Key     Value
        IL      Illinois
        WI      Wisconsin
        CA      California
        1       Vlad
        2       Andrii
        3       Filiz
        4       Vlad

         */

        HashMap<String, String> map = new HashMap<>();
        map.put("IL", "Illinois");
        map.put("WI", "Wisconsin");
        map.put("CA", "California");
        map.put(null, "xxx");
        map.put(null, "yyy");
        map.put("A", null);
        map.put("B", null);
        map.put("C", null);
        System.out.println(map.size());
        System.out.println(map);


    }
}
