public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode tempA = headA;
        ListNode tempB = headB;

        int lenA = 0;
        int lenB = 0;

        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }

        while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }

        int diff = lenA - lenB;

        if (diff < 0) {
            while (diff++ != 0) {
                headB = headB.next;
            }
        } else {
            while (diff-- != 0) {
                headA = headA.next;
            }
        }

        while (headA != null) {
            if (headA == headB) {
                return headA;
            }

            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}