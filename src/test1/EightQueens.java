/**
 * @project LeetCode
 * @package test1
 * @filename EightQueens.java
 */
package test1;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年7月18日 下午9:31:32
 */
public class EightQueens {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EightQueens().eightQueens();
	}
	public void eightQueens(){
		int [] queens = {0,1,2,3,4,5,6,7};
		int count = 0;
		count = permutation(queens,0,count);
		System.out.println(count);
	}
	public int permutation(int [] strs,int index,int count){
		if(index+1==strs.length){
			//check queens 
			if(check(strs)){
				count++;
				for(int i=0;i<strs.length;i++)
					System.out.print(strs[i]+" ");
				System.out.println("");
			}
			
		}else{
			for(int i=index;i<strs.length;i++){
				int tep = strs[i];
				strs[i] = strs[index];
				strs[index] = tep;
				count = permutation(strs, index+1,count);
				tep = strs[i];
				strs[i] = strs[index];
				strs[index] = tep;
			}
		}
		return count;
	}
	public boolean check(int [] queens){
		for(int i=0;i<queens.length;i++)
			for(int j=0;j<queens.length;j++)
				if(i!=j&&(i-j==queens[i]-queens[j]||j-i==queens[i]-queens[j]))
					return false;
		return true;
	}
}
