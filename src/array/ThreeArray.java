package array;

import java.util.*;

public class ThreeArray {
    public static void main(String[] args) {
        String a = new String("c");
        System.err.println(a.hashCode());

        String b = new String("c");
        System.err.println(b.hashCode());
        
        Set<String> set = new HashSet<>();
        set.add(a);
        set.add(b);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.err.println(str);
        }
    }
}
