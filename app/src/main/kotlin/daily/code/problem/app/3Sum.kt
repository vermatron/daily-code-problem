package daily.code.problem.app

class `3Sum` {
    // https://leetcode.com/problems/3sum/
    fun threeSum(nums: IntArray): List<List<Int>> {
        val threeSumList = mutableListOf<List<Int>>()
        nums.sort()
        for (i in 0 until nums.size - 2){
            if (i != 0 && nums[i] == nums[i - 1]) continue

            var left = i + 1
            var right = nums.size -1;

            while(left < right) {
                val sum = nums[i] + nums[left] + nums[right]

                when {
                    sum == 0 -> {
                        threeSumList.add(listOf(nums[i], nums[left], nums[right]))

                        while(left < right && nums[left] == nums[left + 1]) left++
                        while(left < right && nums[right] == nums[right - 1]) right--

                        left++
                        right--
                    }
                    sum < 0 -> left++
                    else -> right--
                }
            }
        }
        return threeSumList
    }
}