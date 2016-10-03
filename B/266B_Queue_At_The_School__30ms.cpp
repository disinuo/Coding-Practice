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
	int n,times;
	cin>>n>>times;
	char queue[50];
	for(int i=0;i<n;i++){
		cin>>queue[i];
	}
	for(int i=0;i<times;i++){
		for(int j=0;j<n-1;j++){
			if(queue[j]=='B'&&queue[j+1]=='G'){
				queue[j]='G';
				queue[j+1]='B';
				j++;
			}			
			
		}
	}
	for(int i=0;i<n;i++) cout<<queue[i];
}
