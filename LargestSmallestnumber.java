package JavaPrograms;

import java.util.*;

public class LargestSmallestnumber{
    public static void main(String[] args){
        int n=0, i=0,large=0,small=0;
//        it takes input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter n value: ");
//       reads the input from console
        n = sc.nextInt();
//        array will hold integer values
        int[] arr = new int[n];

        for(i=0;i<n; i++)
            arr[i] = sc.nextInt();
        large = arr[0];
        small = arr[0];

        for(i=1;i<n; i++){
            //largest
            if(large < arr[i])
                large = arr[i];
//            smallest
            if(small > arr[i])
                small = arr[i];
            }
        System.out.println("largest element" + large);
        System.out.println("smallest element" + small);
            }
        }

