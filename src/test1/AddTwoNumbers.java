/**
 * @project LeetCode
 * @package test1
 * @filename AddTwoNumbers.java
 */
package test1;
/**
 * @author xsh
 * @email xshqhua@foxmail.com
 * @date 2016年6月6日
 * @time 下午7:23:28
 */
public class AddTwoNumbers {

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
		
		h1 = new AddTwoNumbers().addTwoNumbers(h1, h2);
		
		h1.print();
	}
	/**
	 * add the two list numbers
	 * @param l1
	 * @param l2
	 * @return
	 */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode p1 = l1;
		ListNode p2 = l2;
		ListNode head = l1;
		int carry = 0;
		ListNode pre = l1;
		while(p1!=null&&p2!=null){
			p1.val = p1.val+p2.val+carry;
			carry = p1.val/10;
			p1.val = p1.val%10;
			//System.out.println(p1.val+"\t");
			pre = p1;
			p1 = p1.next;
			p2 = p2.next;
		}
		while(p2!=null){
			p2.val +=carry;
			carry = p2.val/10;
			p2.val = p2.val%10;
			pre.next = p2;
			pre = p2;
			p2 = p2.next;
		}
		while(p1!=null){
			p1.val +=carry;
			carry = p1.val/10;
			p1.val = p1.val%10;
			pre = p1;
			p1 = p1.next;
			
		} 
		if(carry==1){
			ListNode tep = new ListNode(carry);
			pre.next = tep;
		}
    	return head;
        
    }
}
