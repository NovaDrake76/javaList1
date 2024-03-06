// Crie um programa que, para cada palavra digitada pelo usuário, informa se esta é ou não
// um palíndromo.

import java.util.Scanner;
import java.util.ArrayList;

class Question2 {
    public static void main(String[] args) {
        System.out.println("type a word...");
        String word = receiveWord();
        String reverseWord = reverseWord(word);

        if (word.equals(reverseWord)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }

    public static String receiveWord() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        scanner.close();
        return word;
    }

    public static String reverseWord(String word) {
        ArrayList<Character> invertedWord = new ArrayList<Character>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            invertedWord.add(0, c);
        }

        return joinChars(invertedWord);
    }

    public static String joinChars(ArrayList<Character> word) {
        StringBuilder builder = new StringBuilder(word.size());

        for (Character ch : word) {
            builder.append(ch);
        }

        return builder.toString();
    }

}
