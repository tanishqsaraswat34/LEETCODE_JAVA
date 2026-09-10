/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> lst=new HashSet<>();
        while(headA!=null){
            lst.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
            if (lst.contains(headB)) return headB;
            headB=headB.next;
        }
        return null;
        
    }
}