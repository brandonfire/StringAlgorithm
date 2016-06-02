public class CC3 {
	//Given two strings write a method to decide if one is a permutation of the others
	public static boolean permu(String a, String b)
	{
		if(a.length()!=b.length()){
			return false;
		}
		int check[] = new int[256];
		int i;
		for(i = 0;i<256;i++)check[i]=0;
		for(i = 0;i<a.length();i++)check[a.charAt(i)]++;
		for(i = 0;i<b.length();i++)if(--check[b.charAt(i)]<0)return false;	
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcdefg";
		String b = "bagedfc";
		boolean c = permu(a,b);
		System.out.println(c);
	}

}
