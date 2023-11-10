package week3.day10.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {
        int arrVal1[] = {3, 2, 11, 4, 6, 7};
        List<Integer> list1 = new ArrayList<>();

        //Adding array 1 to list
        for (int each : arrVal1) {
            list1.add(each);
        }
        Collections.sort(list1);
        System.out.println("List Elements sorted: "+list1);
        System.out.println("The second largest element is "+list1.get(list1.size()-2));
    }
}