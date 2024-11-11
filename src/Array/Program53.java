package Array;

import java.util.Scanner;

public class Program53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element " + i + " : ");
            arr[i] = sc.nextInt();
        }
        int f = Math.max(arr[0], arr[1]);
        int s = Math.min(arr[0], arr[1]);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > f) {
                s = f;
                f = arr[i];
            } else if (arr[i] > s) {
                s = arr[i];
            }
        }

        System.out.println(f + " " + s);
    }
}
