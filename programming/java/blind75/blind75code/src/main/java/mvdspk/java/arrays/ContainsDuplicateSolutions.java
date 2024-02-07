package mvdspk.java.arrays;

import java.util.Arrays;

public class ContainsDuplicateSolutions {
    
    public boolean usingSort(int nums[]){

        // if array is null, empty, or size == 1
        // return false
        if(nums == null || nums.length <= 1){
            return false;
        }
        
        // size > 1
        // sort the array to bing duplicates together- n * long(n)
        Arrays.sort(nums);
        // compare each value with previous value
        // -- initially have a large previous value
        // if same return true
        // else move on , and make previous value as current value

        int previous = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(previous == nums[i]){
                return true;
            }
            else{
                previous = nums[i];
            }
        }
        return false;
    }
}
