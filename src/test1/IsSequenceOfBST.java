/**
 * @project LeetCode
 * @package test1
 * @filename IsSequenceOfBST.java
 */
package test1;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年7月10日 下午3:37:35
 */
public class IsSequenceOfBST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {5,7,6,9,11,10,8};
		System.out.println(new IsSequenceOfBST().isSequenceOfBST(num,0,num.length-1));
		
	}
	//start =0;
	//end = length-1
	public boolean isSequenceOfBST(int [] seq,int start,int end){
		if(seq==null||seq.length==0)
			return false;
		int root = seq[end];
		int i = start;
		for(;i<end;i++){
			if(seq[i]>=root)
				break;
		}
		int j = i;
		for(;j<end;j++)
			if(seq[j]<root)
				return false;
		boolean left = true;
		if(i>start)
			left = isSequenceOfBST(seq,start,i-1);
		boolean right = true;
		if(i<end)
			right = isSequenceOfBST(seq,i+1,end);
		
		return left&&right;
	}
}
