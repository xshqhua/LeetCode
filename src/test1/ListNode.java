/**
 * @project LeetCode
 * @package test1
 * @filename ListNode.java
 */
package test1;
/**
 * @author xsh
 * @email xshqhua@foxmail.com
 * @date 2016年6月6日
 * @time 下午7:23:28
 */
public class ListNode {
	public int val;
	public ListNode next;
	public ListNode(int x) {
		this.val = x;
	}
	
	/**
	 * print ListNode
	 * @param h
	 */
	public void print(){
		ListNode p = this;
		while(p!=null){
			System.out.print(p.val+" ");
			p = p.next;
		}
		System.out.println();
	}
	
}