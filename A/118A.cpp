#include<iostream>
#include<cstdio>
#include<string>
#include<set>
#include<cstring>
#include<cmath>
#include<algorithm> 
#include<sstream>
using namespace std;
char lowerStr[100];
char *vowel="aeiouy";
void lowerCaseAlter(string str);
int ifVowel(char c);
int main(){
	string input;
	cin>>input;
	int length=input.size();
	lowerCaseAlter(input);
	for(int i=0;i<length;i++){
		if(!ifVowel(lowerStr[i])) cout<<"."<<lowerStr[i];
	}
	
}
int ifVowel(char c){
	int i;
	for(i=0;vowel[i];i++){
		if(vowel[i]==c) return 1;
	}
	return 0;
}
void lowerCaseAlter(string str){	
	int i,length=str.size();
	char *ans_p=lowerStr;
	const char *str_p=str.c_str();
	for(i=0;i<length;i++){
		if('A'<=*(str_p+i)&&*(str_p+i)<='Z'){
			*(ans_p+i)=*(str_p+i)+('a'-'A');
		}
		else *(ans_p+i)=*(str_p+i);
	}
	*(ans_p+i)='\0';
} 

