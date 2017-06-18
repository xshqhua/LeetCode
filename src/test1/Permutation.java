/**
 * @project LeetCode
 * @package test1
 * @filename Permutation.java
 */
package test1;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年7月11日 下午8:57:59
 */
public class Permutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] chs = {'1','1','2','3'};
		int m = 3;
		new Permutation().permutation(chs);
		System.out.println("================================");
		new Permutation().combination(chs, m);
		
	}
	public void permutation(char [] chs){
		
		permutation(chs,0);
	}
	
	public void permutation(char [] chs,int index){
		if(index+1==chs.length){
			System.out.println(chs);
		}else{
			for(int i=index;i<chs.length;i++){
				char c = chs[i];
				chs[i] = chs[index];
				chs[index] = c;
				permutation(chs,index+1);
				c = chs[i];
				chs[i] = chs[index];
				chs[index] = c;
			}
		}
	}
	
	//C m,n
	//C select m
	public void combination(char [] chs,int k){
		int [] index = new int [k];
		combination(chs,index,k,k,chs.length);
	}
	
	public void combination(char [] chs,int [] index,int k,int m,int size){
		for(int i=size-1;i>=k-1;--i){
			
			/*if(index[k-1] == i)
				continue;*/
				index[k-1] = i;
			if(k>1)
				combination(chs, index,k-1,m,i);
			else{
				for(int j=0;j<m;j++){
					System.out.printf("%c",chs[index[j]]);
				}
				System.out.println();
			}
		}
	}
}

