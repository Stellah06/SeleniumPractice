package week2.day2.assignments;

import java.util.Arrays;

public class FindMissingElement {
    public static void main(String[] args) {
        int numArray[] = {1, 4, 3, 2, 8, 6, 7};
        Arrays.sort(numArray);
        for (int i = 0; i < numArray.length; i++) {
            if(numArray[i]!=i+1){
                System.out.println("Missing number: "+(i+1));
                break;
            }

        }
    }
}
