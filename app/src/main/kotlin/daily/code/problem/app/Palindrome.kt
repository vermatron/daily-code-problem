package daily.code.problem.app

// https://leetcode.com/problems/valid-palindrome/
class Palindrome {
    fun isPalindrome(s: String): Boolean {
        val chars = s.lowercase()
        var left = 0
        var right = chars.length - 1

        while (left < right) {

            while (left < right && !chars[left].isLetterOrDigit()) {
                left++
            }

            while (left < right && !chars[right].isLetterOrDigit()) {
                right--
            }

            if (chars[left] != chars[right]) {
                return false
            }

            left++
            right--
        }

        return true
    }
}