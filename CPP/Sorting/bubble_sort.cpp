#include <bits/stdc++.h>
using namespace std;

void bubble_sort(vector<int>& nums)
{
    bool swapped = false;
    for(int i =  nums.size()-1; i>0;i-- )
    {
        for(int j= 0 ;j<i;j++)
        {
            if(nums[j]>nums[j+1]){swap(nums[j],nums[j+1]);swapped=true;}
        }
    if(!swapped)break;
    }
}
int main() {
    int n;
    cin >> n;
    vector<int> nums(n);
    for(int i = 0; i < n; i++)
    {
        cin >> nums[i];
    }
    
    cout << "Original array: ";
    for(int num : nums) {
        cout << num << " ";
    }
    cout << endl;
    
    bubble_sort(nums);
    
    cout << "Sorted array: ";
    for(int num : nums)
    {
        cout << num << " ";
    }
    cout << endl;
    
    return 0;
}