/**
 * @project LeetCode
 * @package test1
 * @filename FindNumWithSum.java
 */
package test1;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月5日 下午3:40:22
 */
public class FindNumWithSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FindNumWithSum().init();
		System.exit(0);
	}
	public void init(){
		int [] data = {1,2,4,7,11,15};
		int sum = 15;
		findNumWithSum(data,sum);
	}
	
	public boolean findNumWithSum (int [] data,int sum){
		if(data==null||data.length<2)
			return false;
		int i = 0;
		int j = data.length-1;
		int count = data[i]+data[j];
		while(i<j){
			if(count==sum){
				System.out.println(i);
				System.out.println(j);
				return true;
			}else if(count>sum){
				count -= data[j--];
				count += data[j];
				
			}else {
				count -= data[i++];
				count += data[i];
			}
		}
		return false;
	}

}
