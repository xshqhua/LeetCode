/**
 * @project LeetCode
 * @package test1
 * @filename LeastGemstone.java
 */
package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年7月20日 上午9:53:53
 */
public class LeastGemstone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LeastGemstone().init();
	}
	public void init(){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.nextLine());
		List<Pair> line = new ArrayList<Pair>();
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			Pair s1 = new Pair(x, y);
			line.add(s1);
		}
		String gemstone = leastGemstone(sb,line);
		System.out.println(gemstone);
	}
	public String leastGemstone(StringBuilder sb,List<Pair> line){
		StringBuilder small = sb; 
		boolean flag = false;
		while(!flag){
			flag = true;
			for(Pair p:line){
				StringBuilder tep = swap(small, p);
				if(tep.toString().compareTo(small.toString())<0){
					small = tep; 
					flag = false;
				}
			}
		}
		return small.toString();
	}
	public StringBuilder swap(StringBuilder sb,Pair p){
		StringBuilder sb2 = new StringBuilder(sb);
		sb2.setCharAt(p.x, sb.charAt(p.y));
		sb2.setCharAt(p.y, sb.charAt(p.x));
		if(sb2.toString().compareTo(sb.toString())<0){
			return sb2;
		}else
			return sb;
	}
}

class Pair{
	int x = 0;
	int y = 0;
	public Pair(int x,int y){
		this.x = x;
		this.y = y;
	}
}