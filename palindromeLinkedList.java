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
    public ArrayList<Integer> copyList(ListNode head) {
        ArrayList<Integer> copiedList = new ArrayList<Integer>();
        ListNode temp = head;
        while(temp != null) {
            copiedList.add(temp.val);
            temp = temp.next;
        }
        return copiedList;
    }
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> copiedList = copyList(head);
        int i = 0;
        int j = copiedList.size() - 1;
        while(i < j) {
            if(copiedList.get(i) != copiedList.get(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
