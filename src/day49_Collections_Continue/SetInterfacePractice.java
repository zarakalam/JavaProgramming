package day49_Collections_Continue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {

       /* List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(list);

        */

        Set<Integer> hashSet = new HashSet<>();  //hashSet does not accept duplicates so it will print any numbers twice
        hashSet.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(hashSet);
        System.out.println("=================================================");

        Set<Integer> treeSet = new TreeSet<>();

        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        //  treeSet.addAll(Arrays.asList(null,null,null));


        System.out.println("treeSet = " + treeSet);

        //   String str = null;
        // System.out.println(str.charAt(0));



        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(null, null, null));

        System.out.println("linkedHashSet = " + linkedHashSet);


    }

}
