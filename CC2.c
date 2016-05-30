#include <stdio.h>
#include <stdlib.h>
void reverse(char * str){
	if(!str)return;
	char * end = str;
	char * start = str;
	char tem;
	
	while(*end){
		end++;
	}

	end--;
	while(start<end){
		tem = *start;
		*start = *end;
		*end = tem;
		start++;
		end--;
	}

}



int main(int argc, char* argv[]){
	
	reverse(argv[1]);
	printf("%s\n",argv[1]);
}
