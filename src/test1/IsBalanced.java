/**
 * @project LeetCode
 * @package test1
 * @filename IsBalanced.java
 */
package test1;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月1日 下午1:48:39
 */
public class IsBalanced {
	public int dept = 0;
	public int left = 0;
	public int right = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IsBalanced().init();
	}
	public void init() {
		// TODO Auto-generated method stub
		//TreeNode n1 = new TreeNode();
		int [] data = {1,2,4,-1,-1,5,7,-1,-1,-1,3,-1,6,-1,-1}; 
		TreeNode root = new CreateTreeNode().create(data);
		System.out.println(isBalanced(root));
	}
	
	public boolean isBalanced(TreeNode r){
		return isBalanced(r, 0);
	}
	public boolean isBalanced(TreeNode r,int dept){
		if(r==null){
			this.dept = 0;
			return true;
		}
		if(isBalanced(r.left,this.left)&&isBalanced(r.right, this.right)){
			int diff = this.left - this.right;
			if(diff>=-1&&diff<=1){
				this.dept = 1+(this.left>this.right?this.left:this.right);
				return true;
			}
		}
		
		return false;
	}
	
}
