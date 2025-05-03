package JavaPrograms;

public class LargestandSmallest {

    public static void main(String[] args){
        int n=0, large=0,small=0;

//        array will hold integer values
        int[] arr = {190,27,3900,400,56};

        large = arr[0];
        small = arr[0];
        //largest
        for (int i = 0; i < arr.length; i++) {
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

