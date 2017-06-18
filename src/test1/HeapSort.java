/**
 * @project LeetCode
 * @package test1
 * @filename HeapSort.java
 */
package test1;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年7月22日 下午5:18:45
 */
public class HeapSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HeapSort().init();
		System.exit(0);
	}

	public void init() {
		// TODO Auto-generated method stub
		int [] data = {0,53};
		heapSort(data);
		for(int i=1;i<data.length;i++)
			System.out.print(data[i]+" ");
	}
	
	public void heapSort(int [] data){
		//完成建立大根堆
		for(int i=(data.length-1)/2;i>0;i--){
			heapCreate(data,i,data.length-1);
		}
		//交换跟与尾
		for(int i=data.length-1;i>0;i--){
			int tep = data[1];
			data[1] = data[i];
			data[i] = tep;
			heapCreate(data,1,i-1);
		}
		
	}
	
	//n is node and m is the number of size
	public void heapCreate(int [] data,int n,int m){
		int i = n;
		int key = data[i];
		
		for(int j = 2*i;j<=m;j*=2){
			if(j<m&&data[j]<data[j+1])
				j++;
			if(key>data[j])
				break;
			data[i] = data[j];
			i = j;
		}
		
		data[i] = key;
		
	}
	
	
}
