package HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class SentenceIsPanagram {
    public static boolean checkIfPangram(String sentence) {

//        HashSet<Character> words = new HashSet<>();
//        for(char ch : sentence.toCharArray()) words.add(ch);
//        return words.size()==26;


//        via bitmap
//        int [] bitMap = new int[26];
//        for(char ch : sentence.toCharArray()) bitMap[ch-97]++ ;
//        for (int num : bitMap)if(num==0)return false;
//        return true;

        for(int i =0;i<26;i++){
            if(!sentence.contains((char)(97+i) + ""))return false;
        }
        return true;

    }
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
}
