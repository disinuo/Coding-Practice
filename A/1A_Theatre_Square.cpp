#include<iostream>
#include<cstdio>
#include<string>
#include<set>
#include<cstring>
#include<cmath>
#include<algorithm> 
using namespace std;

int main(){
	long long m,n,a;
	cin>>n>>m>>a;
	long long numX=m/a;
	long long numY=n/a;
	if(m%a!=0) numX++;
	if(n%a!=0) numY++;
	cout<<(numX*numY);
} 
