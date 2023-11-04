package week2.day2.assignments;

public class ReverseOddWordsString {
    public static void main(String[] args) {
        String text= "I am a software tester";
        String[] splitWords=text.split(" ");
        for(int i=0;i<splitWords.length;i++){
            if(i%2==0){
                System.out.print(splitWords[i]+" ");
            }else{
                char[] chars = splitWords[i].toCharArray();
                for(int j=chars.length-1;j>=0;j--){
                    System.out.print(chars[j]);
                }
                System.out.print(" ");
            }
        }
    }
}

