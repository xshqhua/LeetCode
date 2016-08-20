/**
 * @project LeetCode
 * @package test1
 * @filename LucasAndHibo.java
 */
package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年7月21日 下午4:38:52
 */
public class LucasAndHibo {

	public static void main(String []args){
		LucasAndHibo la = new LucasAndHibo();
		/*List<String> line = new ArrayList<String>();
		line.add("Thunder");
		line.add("Wind");
		line.add("Wind");
		line.add("Wind");
		line.add("Soil");
		line.add("Soil");
		//line.set(1, null);
		
		//line.clear();
		
		la.print(line);
		System.out.println(la.sum(line));
		
		*/
		//System.out.println(line.lastIndexOf("BB"));
		
		
		
		//System.out.println(line.);
		
		la.init();
	}
	
	public void init(){
		Scanner sc = new Scanner(System.in);
		List<String> line = new ArrayList<String>(); 
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			for(int i=0;i<n;i++){
				line.add(sc.next());
				int count = sc.nextInt();
				for(int j=1;j<count;j++)
					line.add(line.get(line.size()-1));
			}
			
			List<List<String>> all = new ArrayList<List<String>>();
			permutation(line, 0,all);
			
			List<Integer> index = new ArrayList<Integer>();
			int max = Integer.MIN_VALUE;
			for(int i=0;i<all.size();i++){
				//D(i)=k-i，
				List<String> ll = new ArrayList<String>(all.get(i));
				int count = sum(ll);
				
				if(max==count){
					index.add(i);
				}else if(max<count){
					max = count;
					index.clear();
					index.add(i);
				}
			}
			
			//System.out.println("=================================");
			
			List<String> res = new ArrayList<String>();
			List<String> l2 = new ArrayList<String>();
			StringBuilder sb = new StringBuilder();
			for(Integer tt:index){
				l2 = all.get(tt);
				for(String tt2:l2){
					sb.append(tt2+" ");
				}
				res.add(sb.toString().trim());
				sb = new StringBuilder("");
			}
			String rr = "zzzzzzzzzzzzzzzzzzzzzzzzzzz";
			for(String tt3:res){
				if(rr.compareTo(tt3)>0)
					rr = tt3;
			}
			
			System.out.println(rr);
			
		}
		
		/*for(String tep:line)
			System.out.println(tep);
		System.out.println("============================");*/
		
	}
	
	void permutation(List<String> line,int index,List<List<String>> all){
		if(index==line.size()){
			//print(line);
			all.add(new ArrayList<String>(line));
		}else {
			for(int i=index;i<line.size();i++){
				String tepi = line.get(i);
				String tepindex = line.get(index);
				if(tepindex.compareTo(tepi)!=0){
					line.set(i, tepindex);
					line.set(index, tepi);
					
					permutation(line, index+1,all);
					
					line.set(index, tepindex);
					line.set(i, tepi);
					
				}
				
				
			}
		}
		
	}
	
	public int sum(List<String> line){
		//computer the number
		int count = 0;
		List<String> l1 = new ArrayList<String>(line);
		for(int i=0;i<line.size();i++){
			String tep = line.get(i);
			l1.set(i, null);
			if(l1.contains(tep)){
				count = count + l1.indexOf(tep)-i;
			}
		}
		return count;
	}
	
	public void print(List<String> line) {
		for(String tep:line)
			System.out.print(tep+" ");
		System.out.println();
	}
	
}
