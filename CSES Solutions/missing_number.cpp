#include <iostream>
#include <vector>

using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> arr(n);  
    int sum= 0  ; 
    for (int i = 0; i < n-1; i++) {
        int input ; 
        cin >>input ;
        arr[i] = input ;
        sum += input ;

    }
    int realsum= 0 ;
    for (int i = 1; i <= n ; i++)
    {
        realsum += i ;
    }
    cout<<realsum - sum <<endl;

    return 0;
}