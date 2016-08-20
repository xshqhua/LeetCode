package test1;

import javax.sql.rowset.FilteredRowSet;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年6月28日 下午7:52:46
 */
public class RotateArray {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,1,1,0,1,1,1};
		int a = new RotateArray().rotateArray(nums);
		System.err.println(a);
	}
	/**
	 * 旋转的数组的最小数字
	 * @param numbers
	 * @return
	 */
	public int rotateArray(int [] nums){
		
		int i = 0;
		int j = nums.length-1;
		int mid = i;
		while(nums[i]>=nums[j]){
			if(j-i==1){
				mid = j;
				break;
			}
			if(nums[i]==nums[j]&&nums[mid]==nums[j]){
				return min(nums,i,j);
			}
			mid = (i+j)/2;
			if(nums[mid]>=nums[i]){
				i = mid;
			}
			if(nums[mid]<=nums[j]){
				j = mid;
			}
			//System.out.println(nums[mid]);
		}
		return nums[mid];
		
	}
	
	public int min(int []nums,int start,int end){
		int result = nums[start];
		for(int i = start;i<=end;++i){
			if(result>=nums[i])
				result = nums[i];
		}
		return result;
		
	}
	
	
}
