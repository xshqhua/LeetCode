/**
 * @project LeetCode
 * @package test1
 * @filename FirstNotRepeatingChar.java
 */
package test1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年7月29日 下午8:16:46
 */
public class FirstNotRepeatingChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FirstNotRepeatingChar().init();
	}
	public void init(){
		String str = "abcac";
		System.out.println(firstNotRepeatingChar(str));
	}
	
	public Character firstNotRepeatingChar(String str){
		if(str==null||str.length()==0)
			return null;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		char [] chs = str.toCharArray();
		for(Character c:chs){
			if(map.containsKey(c))
				map.put(c, 2);
			else{
				map.put(c, 1);
			}
		}
		
		Iterator<Character> iter = map.keySet().iterator();
		while(iter.hasNext()){
			Character key = iter.next();
			int num = map.get(key);
			if(num==1){
				return key;
			}
		}
		
		return null;
		
		
	}
}
