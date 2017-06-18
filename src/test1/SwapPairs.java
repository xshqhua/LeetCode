/**
 * @project LeetCode
 * @package test1
 * @filename SwapPairs.java
 */
package test1;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年6月13日 下午12:55:26
 */
public class SwapPairs {
	
	/**
	 * main function
	 * @param args
	 */
	public static void main(String [] args){
		//int [] num1 = {1,2,3,4,5,6,7};
		int [] num1 = {1};
		ListNode h1 = new ListNode(0);
		h1 = new CreateListNode().createListNode(num1);
		h1.print();
		ListNode head = new SwapPairs().swapPairs(h1);
		head.print();
	}
	/**
	 * swap Pairs
	 * Given 1->2->3->4, you should return the list as 2->1->4->3.
	 * @param head
	 * @return
	 */
    public ListNode swapPairs(ListNode head) {
		if(head==null||head.next==null)
			return head;
		ListNode pre = new ListNode(0);
		ListNode h1 = head;
		head = pre;
		while(h1!=null&&h1.next!=null){
			pre.next = h1.next;
			pre = pre.next;
			h1.next = pre.next;
			pre.next = h1;
			h1 = h1.next;
			pre = pre.next;
		}
		//pre.next = h1.next;
    	return head.next;
    	
    }
}
