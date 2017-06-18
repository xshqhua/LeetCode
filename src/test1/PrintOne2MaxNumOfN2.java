/**
 * @project LeetCode
 * @package test1
 * @filename PrintOne2MaxNumOfN2.java
 */
package test1;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年7月5日 下午3:01:16
 */
public class PrintOne2MaxNumOfN2 {
	public static  void main(String []agrs){
		PrintOne2MaxNumOfN2 pOfN2 = new PrintOne2MaxNumOfN2();
		int n = 3;
		pOfN2.printOne2MaxNumOfN2(n);
	}
	public void printOne2MaxNumOfN2(int n){
		char [] number = new char[n];
		//number[n] = '\0'; 
		
		for(int i=0;i<n;++i){
			number[i] = '0';
		}
		paiLie(number,0);
	}
	
	public void paiLie(char [] number,int index){
		if(index==number.length){
			System.out.println(number);
			return;
		}
		for(int i=0;i<10;i++){
			number[index] = (char) (i+'0');
			paiLie(number, index+1);
		}
		
	}
	
}
