package JavaPrograms;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args)
    {
        System.out.println("enter string");
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();

        StringBuilder reversed = new StringBuilder();
        for(int i=str.length()-1 ;i>=0; i--) {
            reversed.append(str.charAt(i));
        }
        System.out.println("reversed string is " +reversed);


    }

}
