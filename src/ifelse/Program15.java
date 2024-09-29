package ifelse;

import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double unit = sc.nextDouble();
        if(unit <= 100)
            System.out.println("bill : " + (unit*4.2));
        else if(unit <=200)
            System.out.println("bill : " + ( (100*4.2) + (unit-100)*6));
        else if(unit <= 400)
            System.out.println("bill : " + ((100*4.2) + (100*6) +  ((unit-200)*8)));
        else
            System.out.println("bill : " + ((100*4.2)  + (100*6) + (200*8) + ((unit-400)*13)));
    }
}
