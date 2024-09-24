package ifelse;

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year%4 == 0)
            System.out.println("leap year");
        else if(year%400 == 0 && year%100 != 0)
            System.out.println("leap year");
        else
            System.out.println("no leap year");
    }
}
