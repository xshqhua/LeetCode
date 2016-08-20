/**
 * @project LeetCode
 * @package test1
 * @filename PrintMatrixClockWisely.java
 */
package test1;

import java.util.ArrayList;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年7月10日 下午12:52:55
 */
public class PrintMatrixClockWisely {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 5;
		int n = 1;
		int [][]number = {{1,2},{3,4},{5,6},{7,8},{9,10}};
//		int count = 0;
//		for(int i=0;i<m;i++){
//			for(int j=0;j<n;j++){
//				number[i][j] = ++count;
//			}
//		}
		
		for(int i=0;i<number.length;i++){
			for(int j=0;j<number[0].length;j++){
				System.out.print(number[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("===============================");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		new PrintMatrixClockWisely().printMatrixClockWisely(number,arr);
		System.out.println("===============================");
		for(int t:arr)
			System.out.print(t+" ");
		System.out.println("===============================");
	}
	public void printMatrixClockWisely(int [][] number,ArrayList<Integer> arr){
		if(number==null||number.length==0)
			return ;
		int m = number.length;
		int n = number[0].length;
		
		int num = 0;
		int i = 0;
		int j = 0;
		
		while(m*n>num){
			while(m*n>num&&j<n-i){
                
				arr.add(number[i][j]);
				System.out.print(number[i][j]+" ");
				
				j++;
				num++;
			}
			j--;
			i++;
			System.out.println();
			while (m*n>num&&i<=m-(n-j)) {
                
				arr.add(number[i][j]);
				System.out.print(number[i][j]+" ");
				i++;
                num++;
				
			}
			i--;
			j--;
			System.out.println();
			while (m*n>num&&j>=(m-i-1)) {
                
				arr.add(number[i][j]);
				System.out.print(number[i][j]+" ");
				j--;
				num++;
			}
			i--;
			j++;
			System.out.println();
			while (m*n>num&&i>j) {
                
				arr.add(number[i][j]);
				System.out.print(number[i][j]+" ");
				i--;
				num++;
			}
			i++;
			j++;
			System.out.println();
		}
		
		
		
	}
}
