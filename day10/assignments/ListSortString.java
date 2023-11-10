package week3.day10.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortString {
    public static void main(String[] args) {
        List<String> companies=new ArrayList<>();
        companies.add("HCL");
        companies.add("Wipro");
        companies.add("Aspire Systems");
        companies.add("CTS");

        System.out.println("Companies : "+companies);
        Collections.sort(companies);
        System.out.print("Companies sorted in reverse order: ");
        for(int i= companies.size()-1;i>=0;i--){
            System.out.print(companies.get(i)+" ");
        }
    }
}
