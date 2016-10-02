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
	int length;
	cin>>length;
	char str[100];
	for(int i=0;i<length;i++){
		cin>>str[i];
	}
	int numOfGroup=0;
	int nums[50];
	int i=0;
	while(str[i]){
		if(str[i]=='B'){
			nums[numOfGroup]=0;
			//cout<<"yeah! i="<<i<<"\n";
			int j=0;
			nums[numOfGroup]++;			
			for(j=i+1;str[j]=='B';j++){
				nums[numOfGroup]++;
			}
			numOfGroup++;
		    i=j+1;
		}
		else i++;		
	}
	if(numOfGroup==0) cout<<"0";
	else{
		cout<<numOfGroup<<"\n";
		for(int i=0;i<numOfGroup;i++){
			cout<<nums[i]<<" ";
		}
	}

}
