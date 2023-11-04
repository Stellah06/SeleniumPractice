package week2.day2.assignments;

public class FindIntersection {
    public static void main(String[] args) {
        int[] list1={3,2,11,4,6,7};
        int[] list2={1,2,8,4,9,7};
        System.out.print("Intersected numbers are:");
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i]==list2[j]){
                    System.out.print(" "+list1[i]);
                }
            }
        }
    }
}
