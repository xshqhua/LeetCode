/**
 * @project LeetCode
 * @package test1
 * @filename QuickSort.java
 */
package test1;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年7月23日 下午4:10:47
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new QuickSort().init();
	}
	public void init(){
		int [] data = {49,14,38,74,96,65,8,49,55,27};
		quick(data);
		for(int tep:data)
			System.out.print(tep+" ");
		System.out.println();
		System.exit(0);
	}
	public void quick(int []data){
		quick2(data, 0, data.length-1);
	}
	public void quick2(int []data,int low,int high){
		if(low<high){
			int index = quick1(data, low, high);; 
			quick1(data, low, index-1);
			quick1(data, index+1,high);
		}
	}
	public int  quick1(int []data,int low,int high){
		int value = data[low];
		while(low<high){
			while(low<high&&data[high]>value)
				high--;
			data[low] = data[high];
			while(low<high&&data[low]<value)
				low++;
			data[high] = data[low];
		}
		data[low] = value;
		return low;
	}
}
