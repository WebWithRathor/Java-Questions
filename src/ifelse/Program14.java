package ifelse;

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        if (amount < 5000)
            System.out.println("discount 0");
        else if (amount > 5000 && amount <= 7000)
            System.out.println("discount 10% : " + (amount * 0.9));
        else if (amount > 7000 && amount <= 10000)
            System.out.println("discount 20% : " + (amount * 0.8));
        else
            System.out.println("discount 30% : " + (amount * 0.7));

    }
}
