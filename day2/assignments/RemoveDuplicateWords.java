package week2.day2.assignments;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String text = "We learn Java basics as part of java sessions in java week1";
        String[] splitWords = text.split(" ");
        System.out.println(text);

        System.out.println("Non repeated words");
        System.out.println("*********************");
        for (int i = 0; i < splitWords.length - 1; i++) {
            for (int j = i + 1; j < splitWords.length; j++) {
                if (splitWords[i].equalsIgnoreCase(splitWords[j])) {
                    splitWords[j] = "";
                }
            }
        }
        for(String a:splitWords){
            System.out.print(a+" ");
        }
    }
}

