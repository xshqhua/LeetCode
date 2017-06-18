package test1;

public class MoveTopM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MoveTopM().init();
		
	}
	
	public void init(){
		int m = 3;
		int []nums = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("test");
		moveTopM(nums, m);
	}
	public void moveTopM(int [] data,int m){
		if(data==null||data.length==0)
			return ;
		int move = data.length-m;
		int []copyNum = new int [data.length*2];
		for(int i=0;i<data.length;i++){
			copyNum[i] = data[i];
			copyNum[i+data.length] = data[i];
		}
		for(int n:copyNum)
			System.out.print(n+" ");
		for(int j=0,i=move;j<data.length;){
			data[j++] = copyNum[i++];
		}
		System.out.println();;
		for(int n:data)
			System.out.print(n+" ");
		
		int topm = 0;
		int lastm = 0;
		for(int i=0;i<data.length;i++){
			if(i<m){
				topm+=data[i];
			}
			if(i>=data.length-m){
				lastm+=data[i];
			} 
		}
		
		System.out.println();
		System.out.println("topm = "+topm);
		System.out.println("lastm = "+lastm);
	}
}
