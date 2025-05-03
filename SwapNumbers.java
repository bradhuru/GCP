package JavaPrograms;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int a,b;
//        it takes input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter a value: ");
//       reads the input from console
        a = sc.nextInt();
        System.out.println("please Enter b value: ");
        b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("swapping of two numbers a= " + a + " , b= " + b);

    }
}


