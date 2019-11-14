package array;

import java.util.*;

public class Demo01 {
    public static void main(String[] args) {

        Map<String ,Integer>map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("f",5);
        map.put("g",6);
        System.err.println(map.get("a"));
        List<Map<String ,Integer>>list = new ArrayList<>();
        list.add(map);
        System.err.println(list.get(0).get("a"));
    }


}

