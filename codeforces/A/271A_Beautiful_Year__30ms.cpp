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
	int n;
	cin>>n;
	int ans=n;
	while(ans<=10000){
		ans++;
		if(isDistinct(ans)) break;
		
	}
	cout<<ans;
}
bool isDistinct(int x){
	int a=x/1000;
	int left=x%1000;
	int b=left/100;
	left=left%100;
	int c=left/10;
	int d=left%10;
	if(a!=b&&a!=c&&a!=d
	&&b!=c&&b!=d&&c!=d) return true;
	return false;
}
