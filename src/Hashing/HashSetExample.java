package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(21);
        set.add(23);
        set.add(24);
        set.add(25);
        set.add(26);
//        System.out.println(set);
        //in set there is no get method.
//        System.out.println(set.contains(26));
        set.remove(23);
//        System.out.println(set);

        //Now how to iterate the hashSet.
//        for(Integer ele : set){
//            System.out.println(ele);
//            set.remove(ele); // this line give you error!! "Using for Each Loop u can't remove elements"
//        }

        //Here, comes Iterators
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            it.remove();
        }
        System.out.println(set);

        //Drawback : Using Iterator you can't be add any element as well as don't go backward.
    }
}


