/**
 * @project LeetCode
 * @package test1
 * @filename FindNumAppearOnce.java
 */
package test1;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月1日 下午3:20:21
 */
public class FindNumAppearOnce {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FindNumAppearOnce().init();
	}
	public void init(){
	/*	int a = 3;
		int b = 2;
		int d = 2;
		int c = a ^ b ^d;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);*/
		
		System.out.println(findFirstOneByBinary(8));
		
		int [] data = {2,4,3,6,3,2,5,5};
		System.out.println(checked(8,4));
		findNumAppearOnce(data);
		
	}
	public int findFirstOneByBinary(int num){
		int count = 0;
		int split = 1;
		int tag = 0;
		while(tag==0){
			tag = num &0x1;
			num = num>>1;
			++count;
			//System.out.println(tag);
		}
		return count;
	}
	
	public int findNumAppearOnce(int []data){
		int bin = 0;
		for(int ss:data){
			bin ^= ss;
		}
		
		int index = findFirstOneByBinary(bin);
		int num1 = 0;
		int num2 = 0;
		
		for(int ss:data){
			if(checked(ss, index)){
				num1^=ss;
			}else{
				num2^=ss;
			}
		}
		
		System.out.println(num1);
		System.out.println(num2);
		
		return 1;
		
	}
	
	
	public boolean checked(int data,int indexBin){
		data = data>>indexBin-1;
		int tep = data&1;
		if(tep==1)
			return true;
		else
			return false;
		
	} 
	
	
}







