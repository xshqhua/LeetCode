/**
 * @project LeetCode
 * @package test1
 * @filename LengthOfLongestSubstring.java
 */
package test1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年6月7日 上午10:47:33
 */
public class LengthOfLongestSubstring {
	/**
	 * Given a string, find the length of the longest substring without repeating characters.
	 * @param s
	 * @return
	 */
    public int lengthOfLongestSubstring(String s) {
    	int longest = 0;
		Queue<Character> queue = new LinkedList<Character>();
		for(Character c:s.toCharArray()){
			while(queue.contains(c)){
				queue.poll();
			}
			queue.add(c);
			if(longest<queue.size())
				longest = queue.size();
		}
    	return longest;
        
    }
	/**
	 * main function
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "abcabcbb";
		//String s = "bbbbbbb";
		String s = "pkkkew";
		System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring(s)); 
	}

}
