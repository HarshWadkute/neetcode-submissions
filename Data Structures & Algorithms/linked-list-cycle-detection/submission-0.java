/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hsr=new HashSet<>();
        while(head!=null){
            if(hsr.contains(head)){
                return true;
            }
            else{
                hsr.add(head);
            }
            head=head.next;
        }
        return false;
    }
}
