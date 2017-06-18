/**
 * @project LeetCode
 * @package test1
 * @filename NumOfOne.java
 */
package test1;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年6月29日 上午10:22:59
 */
public class NumOfOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(new NumOfOne().numOfOne(n));
	}
	public int numOfOne(int n){
		int count = 0;
		while(n!=0){
			n = n&(n-1); 
			++count;
		}
		
		
		return count;
	}
}
