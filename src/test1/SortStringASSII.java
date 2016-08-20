package test1;

public class SortStringASSII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new  SortStringASSII().init();
	}
	public void init(){
		
		
		String str = "abcefaegdbedede";
		char U = 'e';
		
		
		
		
		
		sortASSII(str, U);
	}
	public void sortASSII(String str,char ch){
//		System.err.println("ii");
		char [] chs = str.toCharArray();
		sort(chs);
		for(char c:chs){
			System.out.printf("%c",c);
		}
		
		sort(chs,ch);
		System.out.println();
		for(char c:chs){
			System.out.printf("%c",c);
		}
	}
	public void sort(char [] chs){
		for(int i=0;i<chs.length;i++){
			for(int j=1;j<chs.length-i;j++){
				if(chs[j]<chs[j-1]){
					char tep = chs[j];
					chs[j] = chs[j-1];
					chs[j-1] = tep;
				}
			}
		}
	}
	public void sort(char [] chs,char ch){
		for(int i=0;i<chs.length;i++){
			for(int j=1;j<chs.length-i;j++){
				int t1 = Math.abs(chs[j]-ch);
				int t2 = Math.abs(chs[j-1]-ch);
				if(t1<t2){
					char tep = chs[j];
					chs[j] = chs[j-1];
					chs[j-1] = tep;
				}
			}
		}
	}
}
