package daily.code.problem.app

class LongestNonRepeating {
//    fun lengthOfLongestSubstring(s: String): Int {
//        val sChar = s.toCharArray()
//        var maxLength = 0
//        for (i in sChar.indices) {
//            val seen = mutableSetOf<Char>()
//            var left = i
//            while (left < sChar.size && !seen.contains(sChar[left])) {
//                seen.add(sChar[left])
//                left++
//            }
//            if (seen.size > maxLength) {
//                maxLength = seen.size
//            }
//        }
//        return maxLength
//    }
//    fun lengthOfLongestSubstring(s: String): Int {
//        val lastSeen = IntArray(128) { -1 } // Tracks last seen index of each char
//        var maxLength = 0
//        var left = 0
//
//        for (right in s.indices) {
//            val charIndex = s[right].code
//            if (lastSeen[charIndex] >= left) {
//                // Move left just past the last seen duplicate
//                left = lastSeen[charIndex] + 1
//            }
//
//            // Update last seen index and max length
//            lastSeen[charIndex] = right
//            maxLength = maxOf(maxLength, right - left + 1)
//        }
//
//        return maxLength
//    }
    fun lengthOfLongestSubstring(s: String): Int {
        val seen = mutableSetOf<Char>()
        var left = 0
        var right = 0
        var maxLength = 0

        while (right < s.length) {
            if (!seen.contains(s[right])) {
                seen.add(s[right])
                maxLength = maxOf(maxLength, right - left + 1)
                right++
            } else {
                seen.remove(s[left])
                left++
            }
        }

        return maxLength
    }
}