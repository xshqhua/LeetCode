/**
 * @project LeetCode
 * @package test1
 * @filename Forbidden.java
 */
package test1;

import java.util.Scanner;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年7月30日 下午2:54:43
 */
public class Forbidden {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Forbidden().init();
		
	}
	public void init(){
		forbidden();
	}

	public void forbidden(){
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		while(scanner.hasNext()){
			double s = scanner.nextDouble();
			count = get(s);
			System.out.println(count);
		}
	}
	
	public int get(double s){
		int count = 0;
		int r = (int) Math.sqrt(s);
		/*//System.out.println(r);
		for(int i = 1;i<=r;i++){
			for(int j = 1;j<=r;j++){
				double n = i*i+j*j; 
				if(equal(n,s)){
					count++;
				}else if(n>s){
					break;
				}
			}
		}
		count = count*4;
		*/
		for(int i=1;i<=r;i++){
			int tep = (int) Math.sqrt(s-i*i);
			if(equal(1.0*tep*tep,s-i*i))
				count+=4;
		}
		
		return count;
	}
	
	public boolean equal(double a1,double a2){
		double c = 0.00001;
		if(Math.abs(a1-a2)<=c)
			return true;
		else
			return false;
	}
	
}
