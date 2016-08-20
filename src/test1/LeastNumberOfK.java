/**
 * @project LeetCode
 * @package test1
 * @filename LeastNumberOfK.java
 */
package test1;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年7月22日 下午3:55:40
 */
public class LeastNumberOfK {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LeastNumberOfK().init();
	}
	
	public void init(){
		int [] data = {1,-2,3,10,-4,7,2,-5};
		//int max = leastNumberOfK(data);
		int max = leastNumberOfK(data,0,0,0);
		System.out.println(max);
	}
	
	public int leastNumberOfK(int [] data){
		int max = 0;
		int currValue = max;
		for(int i=0;i<data.length;i++){
			if(currValue<=0){
				currValue = data[i];
			}else{
				currValue = currValue+data[i];
			}
			if(currValue>max)
				max = currValue;
		}
		return max;
	}
	
	public int leastNumberOfK(int [] data,int index,int currValue,int maxValue){
		
		if(index>=data.length)
			return maxValue;
		
		if(currValue<=0)
			currValue = data[index];
		else{
			currValue += data[index];
		}
		
		if(currValue>maxValue)
			maxValue = currValue;
		
		return leastNumberOfK(data,index+1,currValue,maxValue);
		
	}
	
}
