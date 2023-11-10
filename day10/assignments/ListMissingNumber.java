package week3.day10.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMissingNumber {
    public static void main(String[] args) {
        List<Integer> listVal1=new ArrayList<>();
        listVal1.add(1);
        listVal1.add(2);
        listVal1.add(3);
        listVal1.add(4);
        listVal1.add(10);
        listVal1.add(6);
        listVal1.add(8);

        System.out.println("List Elements : "+listVal1);
        Collections.sort(listVal1);
        System.out.println("List Elements sorted: "+listVal1);
        System.out.println("********************************************");
        System.out.print("Missing numbers are ");
        for(int i=0;i<listVal1.size()-1;i++){
            if((listVal1.get(i)+1)!=listVal1.get(i+1))
                System.out.print((listVal1.get(i)+1)+" ");
        }

    }
}
