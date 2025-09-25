package com.YJ1ng.Array;

import java.util.Arrays;

/**
 * 有序数组的平方
 */

public class t977 {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
