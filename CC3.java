public class CC3 {
	//remove the redundant charters of one string by a vector check. O(n) speed
	public static void RemoveDup(char[] str){
		boolean check[] = new boolean[256];
		for(int i =0;i<256;i++){
			check[i]=false;
		}
		int len = str.length;
		int tail = 0;
		for(int i=0;i<len;i++){
			int j = str[i];
			if(check[j]==false){
				str[tail]=str[i];
				check[j]=true;
				tail++;
				}
		}
		str[tail]=0;
	}
	

	public static void main(String[] args) {
		char[] str = {'a','a','c','b','b',0};
		RemoveDup(str);
		 System.out.println(str);
	}

}
