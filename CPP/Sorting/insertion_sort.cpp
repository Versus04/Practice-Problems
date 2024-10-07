#include <bits/stdc++.h>
#include <vector>
using namespace std;


void insertion_sort(vector<int>& nums)
{
    for(int i =0 ; i< nums.size() ;i++)
    {
        int j = i ;
        while(j>0  && nums[j]<nums[j-1])
        {
            swap(nums[j] , nums[j-1]);
            j--;
        }
    }
    
}

int main() {
    int n ;
    cin>>n;

    vector<int> nums(n);
    for(int i = 0 ; i<n;i++)
    {
        cin>>nums[i];
    }
    cout<<"Original Array"<<endl;
    for(int i :  nums)
    {
        cout<<i<<" , ";
    }
    cout<<endl;
    insertion_sort(nums);
    cout<<"Sorted Array"<<endl;
    for(int i :  nums)
    {
        cout<<i<<" , ";
    }
    return 0;
}