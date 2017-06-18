/**
 * @project LeetCode
 * @package test1
 * @filename PrintMinNumber.java
 */
package test1;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年7月29日 下午4:01:07
 */
public class PrintMinNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PrintMinNumber().init();
	}
	
	public void init() {
		// TODO Auto-generated method stub
		int [] nums = {3,32,321};
		System.out.println(printMinNumber(nums));
	}

	public String printMinNumber(int [] nums) {
		StringBuffer res = new StringBuffer();
		String [] str = new String[nums.length];
		
		for(int i=0;i<nums.length;++i){
			str[i] = ""+nums[i];
		}
		
		for(int i=0;i<str.length;++i){
			for(int j=0;j<str.length-i-1;++j){
				if((str[j]+str[j+1]).compareTo(str[j+1]+str[j])>0){
					String tep = str[j];
					str[j] = str[j+1];
					str[j+1] = tep;
				}
			}
		}
		
		for(String s:str)
			res.append(s);
		return res.toString();
	}
}
