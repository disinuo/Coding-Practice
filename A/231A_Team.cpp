#include<iostream>
#include<cstdio>
using namespace std;

int main(){
	int numOfProblems;
	int peopleTotal=3,peopleYes=2;
	int ans=0,oneP=0,temp=0;
	cin>>numOfProblems;
	for(int i=0;i<numOfProblems;i++){
		oneP=0;
		for(int j=0;j<peopleTotal;j++){
			cin>>temp;
			oneP+=temp;
		}
		if(oneP>=peopleYes) ans++;
	}
	cout<<ans;
} 
