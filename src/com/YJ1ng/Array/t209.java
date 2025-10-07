package com.YJ1ng.Array;

/**
 * 长度最下子数组
 */

public class t209 {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        int sum=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            sum=sum+nums[right];
            while(sum>=target){
                min=Math.min(min,right-left+1);
                sum=sum-nums[left];
                left++;
            }
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}
