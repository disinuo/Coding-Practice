#include<iostream>
#include<cstdio>
#include<string>
#include<set>
#include<cstring>
#include<cmath>
#include<algorithm>
using namespace std;

bool isEven(int);
int main() {
    int n;
    cin>>n;
    int nums[n];
    for(int i=0;i<n;i++)
        cin>>nums[i];
//    -------------------
    bool fir=isEven(nums[0]);
    bool last=isEven(nums[n-1]);
    bool pre=fir,current;
    for(int i=0;i<n;i++){
        current=isEven(nums[i]);
        if(current!=pre){
            if(i==n-1){
                if(current!=fir) cout<<(i+1);
                else cout<<(i-1+1);
            } else {
                if(current!=last) cout<<(i+1);
                else cout<<(i-1+1);
            }
            return 0;
        }
        pre=current;
    }
    return 1;
}
bool isEven(int num){
    if(num%2==0) return true;
    else return false;
}