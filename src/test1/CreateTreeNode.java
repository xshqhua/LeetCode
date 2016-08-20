/**
 * @project LeetCode
 * @package test1
 * @filename CreateTreeNode.java
 */
package test1;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月1日 下午1:51:09
 */
public class CreateTreeNode {
	public static int count=0;
	public int notnum = -1;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] data = {1,2,4,-1,-1,5,7,-1,-1,-1,3,-1,6,-1,-1}; 
		new CreateTreeNode().init(data);
	}
	public void init(int []data) {
		TreeNode r = create(data, 0);
		preOrder(r);
		System.out.println();
		inOrder(r);
	}
	public TreeNode create(int []data){
		TreeNode r = create(data, 0);
		return r;
	}
	public TreeNode create(int []data,int index){
		if(data==null)
			return null;
		if(index<0||index>=data.length)
			return null;
		TreeNode node ;
		if(index<data.length){
			if(data[count]!=this.notnum){
				node = new TreeNode(data[count]);
				node.left = create(data, count++);
				node.right = create(data, count++);
			}else
				return null;
		}else
			return null;
		return node;
	}
	public void preOrder(TreeNode r){
		if(r!=null){
			System.out.print(r.val+" ");
			preOrder(r.left);
			preOrder(r.right);
		}
	}
	public void inOrder(TreeNode r){
		if(r!=null){
			inOrder(r.left);
			System.out.print(r.val+" ");
			inOrder(r.right);
		}
	}
}
