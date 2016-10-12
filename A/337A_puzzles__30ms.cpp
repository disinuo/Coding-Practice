#include<iostream>
#include<cstdio>
#include<string>
#include<set>
#include<cstring>
#include<cmath>
#include<algorithm> 
#include<sstream>
using namespace std;
bool isDistinct(int x);
int main(){
	int n,m,temp=0;
	cin>>n>>m;
	int puzzles[50];
	for(int i=0;i<m;i++){
		cin>>puzzles[i];
	}
	for(int i=0;i<m-1;i++){
		for(int j=m-1;j>i;j--){
			if(puzzles[j]<puzzles[j-1]){
				temp=puzzles[j];
				puzzles[j]=puzzles[j-1];
				puzzles[j-1]=temp;
			}
		}
	}
	int ans=puzzles[m-1]-puzzles[0];
	int t=0;
	for(int i=0;i<m-n+1;i++){
		t=puzzles[i+n-1]-puzzles[i];
		if(t<ans) ans=t; 
	}
	cout<<ans;
	
}
