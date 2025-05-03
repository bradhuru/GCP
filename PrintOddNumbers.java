package JavaPrograms;

import java.util.Scanner;

public class PrintOddNumbers {
    public static void main(String args[]){
        int n=0, i=0,odd=0,even=0;
//        it takes input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter n value: ");
//       reads the input from console
        n = sc.nextInt();
//        array will hold integer values
        int[] arr = new int[n];

        for(i=0;i<n; i++)
            arr[i] = sc.nextInt();
        for(i=0;i<n; i++) {
            if (arr[i] % 2 != 0)
            {
                odd=arr[i];
            System.out.println("odd number " +odd);
            }
            else {
                even = arr[i];
            System.out.println("even number " +even);
            }
        }
    }
}
