package week2.day1.assignments;

public class Fibonacci {
    public static void main(String[] args) {
        int num = 5;
        int n1=0,n2=1;
        int counter=0;
        while(counter<=5){
            System.out.println(n1);

            int n3=n1+n2;
            n1=n2;
            n2=n3;
            counter++;

        }
    }
}
