import java.util.Scanner;

class Main {
    public void reverseWordInString(String str) {
        String[] words = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        // System.out.println(str);
        System.out.println(reversedString);
    }
}

public class Reversing {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        sc.close();
        Main obj = new Main();
        obj.reverseWordInString(sentence);

    }
}