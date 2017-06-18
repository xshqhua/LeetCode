/**
 * @project LeetCode
 * @package test1
 * @filename RemoveElement.java
 */
package test1;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年6月13日 下午1:38:42
 */
public class RemoveElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,2};
		int tar = 3;
		System.out.println(new RemoveElement().removeElement(nums, tar));
	}
    public int removeElement(int[] nums, int val) {
    	int count = 0;
    	for(int i =0;i<nums.length;i++){
    		if(nums[i]!=val){
    			nums[count++] = nums[i];
    		}
    	}
		return count;
        
    }
}
