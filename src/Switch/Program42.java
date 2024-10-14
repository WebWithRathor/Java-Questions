package Switch;

import java.util.Scanner;

public class Program42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alph = sc.next().charAt(0);
        switch (alph){
            case 'a','e','i','o','u','A','E','I','O','U' ->{
                System.out.println("Vowel");
            }
            default -> {
                System.out.println("Consonant");
            }
        }
    }
}
