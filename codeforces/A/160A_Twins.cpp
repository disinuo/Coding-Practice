#include<iostream>
#include<cstdio>
using namespace std;
int coins[100];
void sortLtoS(int length);
int sumOf(int length);
int main(){
	int n,ans=1,sum=0;	
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>coins[i];
	}
	sortLtoS(n);
	int average=sumOf(n)/2;
	for(int i=0;i<n;i++){
		sum+=coins[i];
		if(sum<=average) ans++;
		else break; 
	}
	cout<<ans;
}
 
void sortLtoS(int length){
	int temp=0;
	for(int i=0;i<length-1;i++){
		for(int j=0;j<length-i-1;j++){
			if(coins[j]<coins[j+1]){
				temp=coins[j];
				coins[j]=coins[j+1];
				coins[j+1]=temp;
			}
		}
	}
} 
int sumOf(int length){
	int sum=0;
	for(int i=0;i<length;i++){
		sum+=coins[i];
	}	
	return sum;
}
 
