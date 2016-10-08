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
	int n;
	cin>>n;
	double total=0,t;
	for(int i=0;i<n;i++){
		cin>>t;
		total+=t;
	}
	double n_=n;
	double ans=total/n_;
	cout<<ans;
}
