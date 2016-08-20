/**
 * @project LeetCode
 * @package test1
 * @filename RemoveDuplicates.java
 */
package test1;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年6月13日 下午1:24:53
 */
public class RemoveDuplicates {

	/**
	 * main function
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,1,1,2,2,3};
		System.out.println(new RemoveDuplicates().removeDuplicates(nums));
	}
	/**
	 * Given a sorted array, remove the duplicates in place 
	 * such that each element appear only once and return the new length.
	 * Given input array nums = [1,1,2]
	 * Your function should return length = 2, with the first two elements of 
	 * nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
	 * @param nums
	 * @return
	 */
    public int removeDuplicates(int[] nums) {
    	if(nums==null||nums.length==0)
    		return 0;
    	int count = 1;
    	for(int i=1;i<nums.length;i++){
    		if(nums[i-1]!=nums[i]){
    			nums[count] = nums[i];
    			count++;
    			
    		}
    	}
		return count;
        
    }
}
