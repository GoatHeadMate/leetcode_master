package com.YJ1ng.Array;

/**
 * 移除元素
 */

public class t27 {
    public int removeElement(int[] nums, int val) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int flag=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[flag]=nums[i];
                flag++;
            }
        }
        return flag;
    }
}
