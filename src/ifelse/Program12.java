package ifelse;

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if(a>b && a>c)
            System.out.println("a is great");
        else if(b>a && b>c)
            System.out.println("b is great");
        else
            System.out.println("c is great");
    }
}
