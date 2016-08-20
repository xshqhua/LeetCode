/**
 * @project LeetCode
 * @package test1
 * @filename GetNumberOfK.java
 */
package test1;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年7月31日 下午1:15:10
 */
public class GetNumberOfK {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GetNumberOfK().init();
		System.exit(0);
	}
	public void init(){
		int k = 1;
		int [] data = {1,2,3,3,3,4,4,5};
		System.out.println(getFirstK(data, k, 0, data.length-1));
		System.out.println(getLastK(data, k, 0, data.length-1));
		System.out.println(getNumberOfK(data, k));
	}
	public int getLastK(int []data,int k,int left,int right){
		if(left>right)
			return -1;
		int mid = (left+right)/2;
		if(data[mid]==k){
			if(mid==data.length-1||mid<data.length-1&&data[mid+1]!=k)
				return mid;
			else
				return getLastK(data, k,mid+1,right);
		}else if(data[mid]<k){
			return getLastK(data, k,mid+1,right);
		}else{
			return getLastK(data, k,left,mid-1);
		}

	}
	public int getFirstK(int []data,int k,int left,int right){
		if(left>right)
			return -1; 
		int mid = (left+right)/2;
		if(data[mid]==k){
			if(mid>0&&data[mid-1]!=k||mid==0){
				return mid;
			}else{
				return getFirstK(data, k, left, mid-1);
			}
		}else if(data[mid]>k){
			return getFirstK(data, k, left, mid-1);
		}else {
			return getFirstK(data, k, mid+1, right);
		}
	}
	public int getNumberOfK(int []data,int k){
		int left = getFirstK(data, k, 0, data.length-1);
		int right = getLastK(data, k, 0, data.length);
		
		if(left==-1||right==-1){
			return -1;
		}else if(left>right)
			return -1;
		else {
			return right-left+1;
		}
	}

}
