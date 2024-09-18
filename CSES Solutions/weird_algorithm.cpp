#include <bits/stdc++.h>
#include <iostream>
using ll = long long; 
using namespace std;
int main() {
    ll n;
    cin>>n;
    vector<ll> v;
    v.push_back(n);
    while(n!=1) 
    {
        if(n%2==0)
        {
            ll x = n/2;
            v.push_back(x);
            n=n/2;
        }
        else
        {
            ll m = (n*3)+1; 
            v.push_back(m);
            n = (n*3)+1; 
        }

    }
    for(auto it :v ){
        cout<<it<<" ";
    }

    return 0;
}