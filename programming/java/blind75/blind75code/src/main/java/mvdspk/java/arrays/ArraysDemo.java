package mvdspk.java.arrays;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        // Sort in place - Integer Array
        int [] nums = {1,2,3,1,4,5};

        Arrays.sort(nums); // sorts in place O(n) : n*log(n)
        
        // output
        //[1, 1, 2, 3, 4, 5]

        // Array to String 
        //Arrays.toString(nums)
        System.out.println(Arrays.toString(nums));

        // output
        //[1, 1, 2, 3, 4, 5]


    }
}
