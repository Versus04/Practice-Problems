#include <iostream>
#include <vector>
using namespace std;

int main() {
    long long int n;
    long long turns = 0 ;
    cin >> n;
    vector<long long> arr(n);
    for (long i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    for (long i = 1; i < n; i++)
    {
        if(arr[i]<arr[i-1])
        {
        turns += arr[i-1] - arr[i];
            arr[i] = arr[i-1];
        }
    }
        cout<<turns<<endl;
    

    return 0;
}