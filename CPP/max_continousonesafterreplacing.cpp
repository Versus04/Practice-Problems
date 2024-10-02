#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int maximumconti(vector<int> nums , int k)
{
    int maxlength=0;
    int l=0;
    int r=0;
    int zeros=0;
    while(r<nums.size())
    {
        if(nums[r]==0)zeros++;
        while(zeros>k)
        {
           if(nums[l]==0) zeros--;
            l++;
        }
        if(zeros<=k){int length=r-l+1;
        maxlength=max(length,maxlength);}
   r++ ;}


return maxlength;}
int main() {    
   int n;
   cout<<"Enter the size of the array"<<endl;
   cin>>n;
   vector<int> arr(n);
   for(int i =0 ; i<n;i++)
   {
    cin>>arr[i];
   }

    cout<<"Number of ones that can be flipped"<<endl;
    int k;
    cin>>k;

   int maxones=maximumconti(arr,k);

    return 0;
}