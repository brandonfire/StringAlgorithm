//============================================================================
// Name        : DNA.cpp
// Author      : Chengbin Hu
// Version     : 1.0
// Copyright   : Open
// Description : find Open reading frame in DNA sequence by C++
//============================================================================

#include <iostream>
#include<stdio.h>
#include<time.h>
#include<string>

using namespace std;
string randomdna(int dnalen)
{
	string a;
	int i,j;
	srand(time(NULL));
	for (i=0;i<dnalen;i++)
		{
			j = rand() % 4;
			if(j==0)
				a += "A";
			if(j==1)
				a += "T";
			if(j==2)
				a += "C";
			if(j==3)
				a += "G";

		}
	return a;
}
string findorf(string seq){
	int start = seq.find("ATG"), end, leng = seq.length()-start;
	for(int i=0; i<leng; i+=3){
		if (seq.substr(i+start,3) == "TAA")
			{end = i;break;}
	}

	return seq.substr(start,end+3);
}

int main() {
	cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!
	int n;
	string dna;
	cout << "Enter the length of you DNA sequence:" << endl;
	cin >> n;
	dna = randomdna(n);
	cout << dna << endl;
	string orfdna = findorf(dna);
	cout << "your ORF is " << orfdna << endl;
	cout << orfdna.length() << endl;
	char ch[]= "Hello";
	cout << ch << endl;

}
