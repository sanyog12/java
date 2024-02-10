https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}