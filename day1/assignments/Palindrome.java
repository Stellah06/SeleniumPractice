package week2.day1.assignments;

public class Palindrome {
    public static void main(String[] args) {
        int input=121;
        int num=input;
        int output=0;
        int r;
        while(num>0){
            r= num%10;
            output=(output*10)+r;
            num=num/10;
        }
        if(input!=output){
            System.out.println("Number is non palindrome");
        }
        else
            System.out.println("Number is palindrome");
    }
}
