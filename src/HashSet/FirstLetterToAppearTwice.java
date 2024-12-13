package HashSet;

import java.util.HashSet;

public class FirstLetterToAppearTwice {

    public static char repeatedCharacter(String s) {
        HashSet<Character> words = new HashSet<>();
        for (char ch : s.toCharArray()) if (!words.add(ch)) return ch;
        return s.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(repeatedCharacter("abccbaacz"));

    }
}
