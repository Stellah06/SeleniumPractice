package week3.day10.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFindIntersection {
    public static void main(String[] args)  {

        List<Integer> list1=new ArrayList<>();

        int[] arrVal1={3, 2, 11, 4, 6, 7};
        int[] arrVal2={1, 2, 8, 4, 9, 7};

        //Adding array 1 to list
        for (int each:arrVal1){
            list1.add(each);
        }
        //Adding array 2to list
        for (int each:arrVal2){
            list1.add(each);
        }
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        //finding intersetion
        System.out.print("The common numbers are: ");
        for(int i=0;i<list1.size()-1;i++){
            if(list1.get(i)==list1.get(i+1)){
                System.out.print(list1.get(i)+" ");
            }

        }





    }
}
