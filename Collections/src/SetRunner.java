

import java.util.*;
public class SetRunner {
    public static void main(String[] args) {
        List<Character> characters =List.of('A','Z','A','B','Z','F');
        //unique - set
        //Tree
        //Hash
        //LinkedHash
        Set<Character> treeSet=new TreeSet<>(characters);
        System.out.println("treeSet "+treeSet);
        Set<Character> linkedHashSet=new LinkedHashSet<>(characters);
        System.out.println("linkedHashSet "+linkedHashSet);
        Set<Character>  hashSet=new HashSet<>(characters);
        System.out.println("hashSet "+hashSet);

    }
}