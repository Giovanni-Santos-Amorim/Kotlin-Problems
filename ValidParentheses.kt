/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false


Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.

https://leetcode.com/problems/valid-parentheses/

 */
class Solution {
    fun isValid(s: String): Boolean {
        val leftSymbols = Stack<Char>()

        for(c in s.toCharArray())
        {
            if(c == '(' || c == '[' || c == '{')
            {
                leftSymbols.push(c)
            }

            else if(c == ')' && !leftSymbols.isEmpty() && leftSymbols.peek() == '(')
            {
                leftSymbols.pop()
            }

            else if(c == ']' && !leftSymbols.isEmpty() && leftSymbols.peek() == '[')
            {
                leftSymbols.pop()
            }

            else if(c == '}' && !leftSymbols.isEmpty() && leftSymbols.peek() == '{')
            {
                leftSymbols.pop()
            }

            else
            {
                return false
            }
        }

        return leftSymbols.isEmpty()

    }
}