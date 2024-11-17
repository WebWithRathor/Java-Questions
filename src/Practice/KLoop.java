package Practice;

import java.util.Scanner;

public class KLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6;
        int [] arr = {0,0,1,1,0,1};

//        for (int i= 0;i<n ;i++ ){
//            arr[i]=sc.nextInt();
//        }



        int left = 0 ,right = n-1;
        while(left<right){
            System.out.println("left " + left + " " +  right);
            if(arr[left]<arr[right]){
                int temp = arr[left];
                arr[left++]= arr[right];
                arr[right--]= temp;
            }else {
                if(arr[left] == 1) left++;
                if(arr[right] == 0) right--;
            }
        }




        for (int i= 0;i<n ;i++ ){
            System.out.print(arr[i] + " ");
        }

    }
}
