/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int = 0) {
 *     var next: ListNode? = null
 * }
 */

class ListNode(var `val`: Int = 0) {
    var next: ListNode? = null

}


fun main(args: Array<String>) {
    class Solution {
        fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

            return null
        }
    }

    Solution().addTwoNumbers(listNodeCreater(2, 4, 3), listNodeCreater(5, 6, 4))
}

fun listNodeCreater(vararg args: Int): ListNode {

    var listNode: ListNode
    for (i in args.indices) {
        if (i == 0) {
            listNode = ListNode(args.get(i))
        }else{

        }


    }
    return ListNode(2)

}
