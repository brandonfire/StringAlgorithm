public class Cc5 {
	// an algorithm to change all the spaces into 20% assuming there are enought buffer at the end of the char array
	public static void space_change(char[] stri, int length){
		int space_Count = 0, newlength, i;
		//first loop to count the newlength = space count*2 + length
		for(i=0;i<length;i++){
			//count space
			if(stri[i]==' '){
				space_Count++;
			}
		}
		newlength = space_Count*2 + length;
		stri[newlength] = '\0';

		//second loop to change the space to 20%. To avoid overwrite need to loop from the end to the start point
		for(i=length-1; i>=0;i--){
			//change space to 20% other wise no change
			if(stri[i]==' '){
				stri[newlength-1]='%';
				stri[newlength-2]='0';
				stri[newlength-3]='2';
				newlength = newlength-3;
			} else {
				stri[newlength-1] = stri[i];
				newlength--;
			}
		}

	}

	public static void main(String args[]){
		
		char[] spaa = {'a',' ',' ','b',' ','c',' ','\0',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
		System.out.println("befor change");
		System.out.println(spaa);
        space_change(spaa,7);
		System.out.println(spaa);
	}

}

