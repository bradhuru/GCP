package JavaPrograms;

import java.util.Scanner;

public class PrintArrayElements {
    public static void main(String args[]) {
        int n = 0, i = 0;
//        it takes input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter n value: ");
//       reads the input from console
        n = sc.nextInt();
//        array will hold integer values and allocate a memory for elements by using new keyword
        int[] arr = new int[n];
//        take elements from user
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (i = 0; i < n; i++)
        System.out.println("array elements are" + arr[i]);

    }
}