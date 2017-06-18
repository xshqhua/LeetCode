/**
 * @project LeetCode
 * @package test1
 * @filename UglyNumber.java
 */
package test1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年7月29日 下午4:31:58
 */
public class UglyNumber {
	List<Integer> ugly = new ArrayList<>();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UglyNumber().init();
		
	}

	public void init() {
		// TODO Auto-generated method stub
		int len = 1500;
		int num = len;
		uglyNumber(len);
		System.out.println(getUglyNumber(num));
		System.exit(0);
	}
	public void uglyNumber(int len){
		ugly.add(1);
		
		int i2 = 0;
		int i3 = 0;
		int i5 = 0;
		int lastValue = 1;
		while(ugly.size()<=len){
			int tep2 = ugly.get(i2)*2;
			int tep3 = ugly.get(i3)*3;
			int tep5 = ugly.get(i5)*5;
			while(tep2<=lastValue)
				tep2 = ugly.get(++i2)*2;
			while(tep3<=lastValue)
				tep3 = ugly.get(++i3)*3;
			while(tep5<=lastValue)
				tep5 = ugly.get(++i5)*5;
			lastValue = min(tep2,tep3,tep5);
			ugly.add(lastValue);
		}
	}
	public int  getUglyNumber(int num){
		if(num>0){
			
			return ugly.get(num-1);
		}
		return -1;
	}
	public int min(int a,int b,int c){
		return a>b?(b>c?c:b):(a>c?c:a);
		
	}

}
