/**
 * @project LeetCode
 * @package test1
 * @filename Partition.java
 */
package test1;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年7月19日 上午10:53:42
 */
public class Partition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=0;i<100;i++){
			System.out.println(new Partition().random(1, 10));
		}*/
		int a = 10;
		int b = 4;
		int []ss = {a,b};
 		new Partition().swap(ss);
		
	}
	public int partition(int []data,int start,int end){
		int index = random(start, end);
		int value = data[index];
		int tep = data[start];
		while(start<end){
			while(start<end&&data[end]>=value){
				end--;
			}
			data[start] = data[end]; 
			while(start<end&&data[start]>=value)
				start++;
			data[end] = data[start];
		}
		data[start] = tep;
		return 1;
	}
	public int random(int start,int end){
		int num = (int) (Math.random()*(end-start))+start;
		return num;
	}
	public void swap(int []data){
		System.out.println(data[0]+"\t"+data[1]);
		data[0] = data[0]+data[1];
		data[1] = data[0]-data[1];
		data[0] = data[0]-data[1];
		System.out.println(data[0]+"\t"+data[1]);
	}
}
