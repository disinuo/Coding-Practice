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
	int i,k,n;
	cin>>n>>k;
	int scores[50];
	for(i=0;i<n;i++){
		cin>>scores[i];
	}
	int ans=0;
	int root=scores[k-1];
	for(i=0;i<n;i++){
		if(scores[i]!=0&&scores[i]>=root) ans++;
		else break;
	}
	cout<<ans;
} 

