#include <iostream>
using namespace std;
#include <bits/stdc++.h>
int main() {
    long long n;
    cin >> n;
    long long turns = 0 ;
    vector<int> arr(n);
    for (long i = 0; i < n; i++) {
        cin >> arr[i];
    }
    
    for(long i = 1; i < n; i++)
   {
    if(arr[i]<arr[i-1])
    {
        turns += arr[i-1]-arr[i];
        arr[i] = arr[i-1];   
    }
   }
    cout<<turns<<endl;
    
    
    return 0;
}