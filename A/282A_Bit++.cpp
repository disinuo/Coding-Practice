#include<iostream>
#include<cstdio>
using namespace std;

int main(){
	int numOfSequence,x=0;
	char a,op,b;
	cin>>numOfSequence;
	for(int i=0;i<numOfSequence;i++){
		cin>>a>>op>>b;
		if(op=='+') x++;
		else x--;
	}
	cout<<x;
} 
