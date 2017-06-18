/**
 * @project LeetCode
 * @package test1
 * @filename PrintOne2MaxNumOfN.java
 */
package test1;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年6月29日 上午11:14:22
 */
public class PrintOne2MaxNumOfN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintOne2MaxNumOfN t = new PrintOne2MaxNumOfN();
		int n = 2;
		t.printOne2MaxNumOfN(n);
		
		
		System.exit(0);
	}
	public void printOne2MaxNumOfN(int n){
		char [] chs = new char[n+2];
		for(int i=0;i<=n;++i)
			chs[i] = '0';
		chs[n+1] = '\0';
		while(chs[0]!='1'){
			print(chs);
			addOne(chs);
		}
		/*System.out.printf("%s",addOne(chs));
		for(char a:chs){
			System.out.println(a);
		}*/
	}
	public void addOne(char [] chs){
		int carry = 0;
		int num = chs[chs.length-2] - '0';
		++num;
		chs[chs.length-2] = (char) ('0' + num%10);
		carry = num/10;
		for(int i=chs.length-3;i>=0;--i){
			num = (chs[i] - '0') + carry;
			carry = num/10;
			if(num>9){
				chs[i] = (char) ('0' + num - 10);
			}else{
				chs[i] = (char) ('0' + num);
			}
		}
	}
	public void print(char [] chs){
		/*for(int i=1;i<chs.length;++i)
			System.out.print(chs[i]);
		System.out.println();*/
		
		System.out.println(new String(chs).substring(1));
	}
}
