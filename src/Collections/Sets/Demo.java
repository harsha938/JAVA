package Collections.Sets;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Demo {

    public static void main(String[] args) {
        Collection<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(20);

        set.remove(20);
        System.out.println(set.contains(20));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // for(int n:set){
        //   System.out.println(n);
        // }
    }
}
