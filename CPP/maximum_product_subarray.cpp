#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
int maxProductSubarray(vector<int> nums){
    int suffix=1;
    int prefix=1;
    int ans=0;
    for(int i =0;i<nums.size();i++)
    {
        if(suffix==0)suffix=1;
        if(prefix==0)prefix=1;
        prefix=prefix*nums[nums.size()-i-1];
        suffix=suffix*nums[i];
        ans=max(ans,max(prefix,suffix));
    }


return ans;
}
int main() {
    int n;
    cout << "Enter the number of elements: ";
    cin >> n;

    vector<int> nums(n);
    cout << "Enter the elements: ";
    for (int i = 0; i < n; ++i) {
        cin >> nums[i];
    }

    int result = maxProductSubarray(nums);
    cout << "Maximum product subarray is: " << result << endl;

    return 0;
}