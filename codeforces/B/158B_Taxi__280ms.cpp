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
	int groups[4];
	int n;
	//initialize
	for(int i=0;i<4;i++) groups[i]=0;
	cin>>n;
	int temp;
	for(int i=0;i<n;i++){
		cin>>temp;
		groups[temp-1]++;
	}
	int ans=groups[3]+groups[1]/2;
	if(groups[1]%2==0){//ֻʣ1��3�˵��� 
		if(groups[2]>=groups[0]){//3�˵Ķ� 
			ans+=groups[2];
		}else ans+=(groups[2]+(groups[0]-groups[2]-1)/4+1);
	}else{//ʣ1��3����  ��һ��2�˵� 
		if(groups[2]>=groups[0]){//3�˵Ķ� 
			ans+=(groups[2]+1);
		}else ans+=(groups[2]+(groups[0]-groups[2]+1)/4+1);
	}
	cout<<ans;
}
