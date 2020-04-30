/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> a= new ArrayList<ListNode>();
        int i=0;
        while(head!=null){
            a.add(head);
            head=head.next;
            i++;
        }
        
        if(i%2==0){
            return a.get(i/2);
        }
        else{
            return a.get(i/2);
        }
    }
}
