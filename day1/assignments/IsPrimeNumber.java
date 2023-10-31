package week2.day1.assignments;

public class IsPrimeNumber {
    public static void main(String[] args) {
        int num=7;
        int check=0;
        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                check++;
                break;
            }
        }
        if(check==0)
            System.out.println("Number is prime");
        else
            System.out.println("Number is not prime");
    }
}
