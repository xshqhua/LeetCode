package test1;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SubString().init();
	}

	public void init(){
		String str = "abcdefabcdefg";
		String subs = "a?c??f";
		subString(str, subs);
	}
	public String subString(String str,String subs){
		int start = 0;
		int end = 0;
		int j = 0;
		for(int i=0;i<str.length();i++){
			start = i;
			int s = i;
			for(j=0;j<subs.length();j++){
				if(subs.charAt(j)=='?'){
					s++;
				}else if(subs.charAt(j)==str.charAt(s)){
					s++;
				}else
					break;
			}
			if(j==subs.length()){
				break;
			}
		}
		if(start+subs.length()>str.length()){
			System.out.println("ц╩спур╣╫");
			return "";
		}
		String res = str.substring(start,start+subs.length());
		System.out.println(res);
		return res;
	}
}
