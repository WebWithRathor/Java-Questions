package Practice;

import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        int copy = digit;
        int digitCount = 0;
        while(digit > 0){
            digitCount++;
            digit=digit/10;
        }
        if((Math.pow(copy,2) % Math.pow(10,digitCount)) == copy){
            System.out.println("Auto");
        }else{
            System.out.println("not");
        }
    }
}
