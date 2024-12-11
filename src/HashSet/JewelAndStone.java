package HashSet;

import java.util.HashSet;

public class JewelAndStone {
    public static int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jule = new HashSet<>();
        int count = 0;

        for (char ch : jewels.toCharArray()) jule.add(ch);

        for(char ch : stones.toCharArray()){
            if(jule.contains(ch))count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }
}
