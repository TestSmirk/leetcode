class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = hashMapOf<Int,Int>()
        for (i in nums.indices) {
            map.put(nums[i], i)
        }
        map.forEach { t, u ->
            println("t $t ,u $u")
        }
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement) && map.get(complement) !== i) {
                return intArrayOf(i, map.get(complement)!!)
            }
        }
        return intArrayOf(0, 0)
    }
}

fun main(args: Array<String>) {
    print(Solution().twoSum(intArrayOf(2,11,7,15),9).joinToString(" "))
}