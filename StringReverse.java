package JavaPrograms;

import java.util.*;

public class StringReverse {
    public static void main(String[] args)
    {
        System.out.println("enter string");
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("reversed string is " +reversed);


    }
}
