#include<iostream>
#include<cstdio>
using namespace std;

string female="CHAT WITH HER!";
string male="IGNORE HIM!";
int numOf(char *str);
int letterTotal=26;
int main(){
	char name[100];
	cin>>name;
	int numOfLetter=numOf(name);
	if(numOfLetter%2==0) cout<<female;
	else cout<<male;
}
int numOf(char *str){
	int ans=0;
	for(int i=0;i<letterTotal;i++){
		for(int j=0;str[j];j++){
			if(str[j]==('a'+i)){
				ans++;
				break;
			}
		} 
	}
	return ans;
}
