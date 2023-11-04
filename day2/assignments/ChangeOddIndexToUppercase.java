package week2.day2.assignments;

public class ChangeOddIndexToUppercase {
    public static void main(String[] args) {

        String text="changeme";
        int length=text.length();
        char[] convertedText =text.toCharArray();
        for(int i=0;i<length;i++){
            if(i%2==0){
                System.out.print(convertedText[i]);
            }else
                System.out.print(Character.toUpperCase(convertedText[i]));

        }
    }
}
