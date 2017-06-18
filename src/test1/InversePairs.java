/**
 * @project LeetCode
 * @package test1
 * @filename InversePairs.java
 */
package test1;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年7月31日 上午11:46:47
 */
public class InversePairs {
	public static void main(String[] args) {
		new InversePairs().init();
	}
	public void init(){
		int [] nums = {7,5,6,4};
		System.out.println(inversePairs(nums));
	}
	
	public int inversePairs(int []data){
		int count = 0;
		if(data==null||data.length<=1)
			return count;
		int []copy = new int[data.length];
		for(int i =0;i<data.length;i++)
			copy[i] = data[i];
		count = inversePairs(data,copy,  0, data.length-1);
		return count;
	}
	
	public int inversePairs(int []data,int []copy,int start,int end){
		if(start==end){
			copy[start] = data[end];
			return 0;
		}
		int mid = (end-start)/2;
		int left = inversePairs(copy,data,start,start+mid);
		int right = inversePairs(copy,data,start+mid+1,end);
		int count = 0;
		int i = start+mid;
		int j = end;
		int index = end;
		while(i>=start && j>=start+mid+1){
			if(data[i]>data[j]){
				count +=j-start-mid;
				copy[index--] = data[i--];
			}else{
				copy[index--] = data[j--];
			}
		}
		
		for(;i>=start;--i)
			copy[index--] = data[i];
		for(;j>=start+mid+1;--j)
			copy[index--] = data[j];
		
		return left+right+count;
		
	}
	
}
