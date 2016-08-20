/**
 * @project LeetCode
 * @package test1
 * @filename NegationEven.java
 */
package test1;

import java.util.Scanner;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年7月19日 下午9:14:21
 */
public class NegationEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int []data = new int [n];
			for(int i=0;i<n;i++){
				data[i] = sc.nextInt();
			}
			 for(int i =0;i<n-1;i++)
			      System.out.print(data[i]+" ");
			  System.out.print(data[n-1]+"\n");
			  negationEven(data);
		}
		sc.close();
		
	}
	public static void negationEven(int []data){
		for(int i=0;i<data.length;i++){
			StringBuilder sb = new StringBuilder(Integer.toBinaryString(data[i]).trim());
			//System.out.print(sb+"\t");
			if(sb.charAt(sb.length()-1)=='0')
				data[i] = Integer.valueOf(sb.reverse().toString(),2);
			else
				data[i] = Integer.valueOf(sb.toString(),2);
				
			System.out.print(data[i] +"\t");
		}
		System.out.println();
	}
	
}
