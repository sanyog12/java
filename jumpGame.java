https://leetcode.com/problems/jump-game/?envType=study-plan-v2&envId=top-interview-150


class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length <= 1){
            return true;
        }
        int stepsleft = nums[0];
        int index = 1;
        while(stepsleft > 0){
            if (index == nums.length-1){
                return true;
            }
            stepsleft = Math.max(stepsleft-1, nums[index]);
            index++;
        }
        return false;
    }
}