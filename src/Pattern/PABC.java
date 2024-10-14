package Pattern;

import java.util.Scanner;

public class PABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.next().charAt(0);
        for (char i = 'a'; i <= n; i++) {
            for (char j = 'a'; j <= n; j++) {
                if (i + 1 > j)
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
