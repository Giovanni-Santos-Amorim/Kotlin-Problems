/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.

https://leetcode.com/problems/longest-common-prefix/
*/
class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        val commonPrefix = StringBuilder()

        if(strs.isEmpty())
        {
            return commonPrefix.toString()
        }

        var minimunLength = strs[0].length

        for(i in 1 until strs.size)
        {
            minimunLength = minimunLength.coerceAtMost(strs[i].length)
        }

        for(i in 0 until minimunLength)
        {
            val current = strs[0][i]

            for(str in strs)
            {
                if(str[i] != current)
                {
                    return commonPrefix.toString()
                }
            }

            commonPrefix.append(current)
        }

        return commonPrefix.toString()
    }
}