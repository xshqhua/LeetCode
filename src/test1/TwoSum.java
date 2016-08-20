package test1;

import java.util.HashMap;
import java.util.Map;
/**
 * @author xsh
 * @email xshqhua@foxmail.com
 * @date 2016年6月6日
 * @time 下午7:23:28
 */
public class TwoSum {
	/**
	 * main function
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,1,2,2};
		int target = 3;
		new TwoSum().twoSum(nums, target);
		System.out.println("==");
	}
	/**
	 * calculate two numbers and equal the target 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {
        int [] num = {-1,-1};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++){
			int tar = target-nums[i];
			map.put(tar, i);
		}
		for(int i=0;i<nums.length;i++){
			if(map.get(nums[i])!=null&&map.get(nums[i])!=i){
				num[1] = map.get(nums[i]);
				num[0] = i;
				return num;
			}
		}
		return num;
    }
}
