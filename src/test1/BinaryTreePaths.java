/**
 * @project LeetCode
 * @package test1
 * @filename BinaryTreePaths.java
 */
package test1;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreePath;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年7月10日 下午8:40:36
 */
public class BinaryTreePaths {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public List<String> binaryTreePaths(TreeNode root) {
    	List<String> line = new ArrayList<String>();
    	treePath(root, line, "");
		return line;
        
    }
    
    public void treePath(TreeNode t,List<String> line,String str){
    	if(t==null){
    		return ;
    	}
    	if(t.left!=null){
    		treePath(t.left,line,str+t.val+"->");
    	}
    	if(t.right!=null){
    		treePath(t.right,line,str+t.val+"->");
    	}
    	if(t.right==null&&t.left==null){
    		line.add(str+ t.val);
    	}
    }
    
    
}
