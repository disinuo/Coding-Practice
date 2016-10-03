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
	long long total,m;
	cin>>total>>m;
	long long count=0;
	long long pre=0,next=0;
	for(long long i=0;i<m;i++){
		cin>>next;
		if(pre>next){
			count++;
		}
		pre=next;
	}
	long long ans=count*total+next-1;
	cout<<ans;
}
