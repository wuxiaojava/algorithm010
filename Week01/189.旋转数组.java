/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 */

// @lc code=start
class Solution_189 {
    public void rotate(int[] nums, int k) {
        int tmp;
        int previous;

        for(int i = 0 ; i < k ; i ++){
            previous = nums[nums.length - 1];
            for(int j = 0; j< nums.length;j++){
                tmp = nums[j];
                nums[j] = previous;
                previous = tmp;
            }
        }
    }
}
// @lc code=end

