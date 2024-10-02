#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

void selection_sort(vector<int>& nums)
{
    int n = nums.size();
for(int i ; i< nums.size()-1;i++)
    {
                int mini= i;
        for(int j = i+1 ;j<n;j++)
        {
            if(nums[j]<nums[mini])mini=j;

        }
        swap(nums[mini] , nums[i]);
    }
    for(int i : nums)
    {
        cout<<i <<" , ";
    }
}
int main(){

    int n ;
    cin>>n;
    vector<int> nums(n);
   
    for(int i =0 ; i<n;i++)
    {
        cin>>nums[i];
    }
    selection_sort(nums);

}