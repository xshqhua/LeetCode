/**
 * @project LeetCode
 * @package test1
 * @filename Queue2Stack.java
 */
package test1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年6月28日 下午3:36:33
 */
public class Queue2Stack {
	
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue2Stack q2s = new Queue2Stack();
		q2s.inStack(0);
		q2s.inStack(1);
		q2s.inStack(2);
		q2s.inStack(3);
		System.out.println(q2s.outStack());
		System.out.println(q2s.outStack());
		System.out.println(q2s.outStack());
		System.out.println(q2s.outStack());
		
		
	}
	public Queue<Integer> queue1 = new LinkedList<Integer>();
	public Queue<Integer> queue2 = new LinkedList<Integer>();
	
	public void inStack(int x){
		this.queue1.add(x);
	}
	
	public int outStack() throws Exception{
		if(this.isEmpty())
			throw new Exception("the stack is null");
		int tep;
		while(this.queue1.size()!=1){
			 tep = this.queue1.poll();
			this.queue2.offer(tep);
		}
		
		tep = this.queue1.poll();
		Queue<Integer> qu = new LinkedList<Integer>();
		qu = this.queue1;
		this.queue1 = this.queue2;
		this.queue2 = qu;
		return tep;
	}
	
	public boolean isEmpty(){
		if(this.queue1.isEmpty()&&this.queue2.isEmpty())
			return true;
		return false;
	}
}
