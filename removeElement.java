https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int removeElement(int[] nums, int val) {

        if (nums.length == 0)
            return 0;
        int valid_size = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[valid_size] = nums[i];
                valid_size++;
            }
        }
        return valid_size;
    }
}