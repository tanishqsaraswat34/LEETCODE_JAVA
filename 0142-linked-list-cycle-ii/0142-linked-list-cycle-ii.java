/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> nodeset=new HashSet<>();
        while(head!=null){
            if(nodeset.contains(head)){
                return head;
            }
            nodeset.add(head);
            head=head.next;
        }
        return null;        
    }
}