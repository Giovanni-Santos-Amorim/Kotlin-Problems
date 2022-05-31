/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

url = https://leetcode.com/problems/two-sum/
 */


class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray{
        val sumArray = intArrayOf(0,0)

        val n = nums.size

        for(i in 0.. n - 2)
        {

            for(i2 in 1.. n - 1)
            {

                if(nums[i] + nums[i2] == target && i != i2)
                {
                    sumArray.set(0, i)
                    sumArray.set(1, i2)

                }

            }
        }

        return sumArray
    }
}