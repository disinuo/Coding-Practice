#include<iostream>
#include<cstdio>
#include<string>
#include<set>
#include<cstring>
#include<cmath>
#include<algorithm> 
#include<sstream>
using namespace std;

int main(){
	int num_of_word,i=0,l;	
	string words[100];
	string ans[100];
	string mid;
	cin>>num_of_word;
	for(i=0;i<num_of_word;i++){
		cin>>words[i];
		l=words[i].size();
		if(l<=10) ans[i]=words[i];
		else{
			stringstream ss;
			ss<<l-2;
			ss>>mid;
			ans[i]=words[i].substr(0,1)+mid+words[i].substr(l-1,l);
		}
	}
	for(i=0;i<num_of_word;i++){
		cout<<ans[i]<<"\n";
	}	
} 

