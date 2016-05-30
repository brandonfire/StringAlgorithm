public class CC1 {
	
	public static boolean uniq(String str){
		boolean check[] = new boolean[256];
		int i;
		for(i=0;i<256;i++){
			check[i] =false;
		}
		for(i=0;i<str.length();i++){
			int c = str.charAt(i);
			if(check[c]==true){
				return false;
			}
			check[c] = true;
		}
		
		
		return true;
	}

}
