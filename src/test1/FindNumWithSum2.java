package test1;
public class FindNumWithSum2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FindNumWithSum2().init();
		System.exit(0);
	}
	public void init(){
		int n = 15;
		int sum = 15;
		findNumWithSum(n,sum);
	}
	
	public void findNumWithSum (int n,int sum){
		int i = 1;
		int j = i;
		int count = i;
		int mid = (n+1)/2;
		while(j<=mid){
			
			if(count>sum){
				count = count-i;
				i++;
			}
			
			if(count<sum){
				j++;
				count = count+j;
			}
			
			
			if(count==sum){
				print(i, j);
				count -= i;
				i++;
			}
			
				
		}
	}
	public void print(int i,int j){
		for(int k=i;k<=j;k++){
			System.out.print(k+" ");
		}
		System.out.println();
	} 

}
