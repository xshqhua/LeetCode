/**
 * @project LeetCode
 * @package test1
 * @filename CreateListNode.java
 */
package test1;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年7月10日 下午9:03:35
 */
public class CreateListNode {
	
	/**
	 * createListNode
	 * @param nums
	 * @return
	 */
	public ListNode createListNode(int [] nums){
		if(nums==null||nums.length==0)
			return null;
		ListNode head = null;
		if(nums.length>=1)
			head = new ListNode(nums[0]);
		ListNode p = head;
		for(int i =1;i<nums.length;i++){
			ListNode q = new ListNode(nums[i]);
			p.next = q;
			p = q;
		}
		//this.next = head;
		return head;
	}

	/** 
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,2,3,4,5,6,7};
		ListNode h = new CreateListNode().createListNode(nums);
		h.print();
	}
	
	

}
