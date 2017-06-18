/**
 * @project LeetCode
 * @package test1
 * @filename MergeTwoLists.java
 */
package test1;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年6月7日 上午11:05:02
 */
public class MergeTwoLists {
	/**
	 * Merge two sorted linked lists and return it as a new list. 
	 * The new list should be made by splicing together the nodes of the first two lists.
	 * @param l1
	 * @param l2
	 * @return ListNode
	 */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode head = new ListNode(0);
    	ListNode p = head;
    	while(l1!=null&&l2!=null){
    		if(l1.val<l2.val){
    			p.next = l1;
    			l1 = l1.next;
    			p = p.next;
    		}else {
    			p.next = l2;
    			l2 = l2.next;
    			p = p.next;
				
			}
    	}
    	while(l1!=null){
			p.next = l1;
			l1 = l1.next;
			p = p.next;
    	}
    	while(l2!=null){
    		p.next = l2;
    		l2 = l2.next;
    		p = p.next;
    	}
		return head.next;
        
    }
	/**
	 * main function
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num1 = {1,2,3,4,5,6,7};
		int [] num2 = {2,3,4,5,6,7};
		ListNode h1 = new ListNode(0);
		ListNode h2 = new ListNode(0);
		h1 = new CreateListNode().createListNode(num1);
		h1.print();
		h2 = new CreateListNode().createListNode(num2);
		h2.print();
		
		ListNode head = new MergeTwoLists().mergeTwoLists(h1, h2);
		head.print();
		
	}

}
