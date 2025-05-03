package JavaPrograms;
import java.util.*;
    public class SecLargeSecSmall{

        public static void main(String[] args) {
            // Create Scanner object to take input
            Scanner sc = new Scanner(System.in);

            // Take input for the size of the array
            System.out.print("Enter the number of elements in the array: ");
            int n = sc.nextInt();

            // Create an array and take its elements as input
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            // Print the results
            System.out.println("Second Largest Element: " + arr[n-2]);
            System.out.println("Second Smallest Element: " + arr[1]);


        }
    }



