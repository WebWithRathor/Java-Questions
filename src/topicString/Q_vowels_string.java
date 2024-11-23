package topicString;

import java.util.Scanner;

public class Q_vowels_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int i = 0 , countVowel = 0 , countConsonant = 0;
        while (i < name.length()) {
            switch (name.charAt(i++)){
                case 'a','e','i','o','u'->countVowel++;
                default -> countConsonant++;
            }
        }
        System.out.println("Vowel Count : " + countVowel + "\nConsonant Count : " + countConsonant);
    }
}
