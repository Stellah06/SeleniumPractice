package week3.day10.assignments;

import java.util.*;

public class SetUniqurChar {
    public static void main(String[] args) {
        String name="google";
        char[] chars = name.toCharArray();

        System.out.println("Implementing Hash Set");
        Set<Character> charArray1=new HashSet<>();
        for(char each:chars){
            charArray1.add(each);
        }
        System.out.println(charArray1);

        System.out.println("Implementing Linked Hash Set");
        Set<Character> charArray2=new LinkedHashSet<>();
        for(char each:chars){
            charArray2.add(each);
        }
        System.out.println(charArray2);


        System.out.println("Implementing Tree Set");
        Set<Character> charArray3=new TreeSet<>();
        for(char each:chars){
            charArray3.add(each);
        }
        System.out.println(charArray3);
    }
}
