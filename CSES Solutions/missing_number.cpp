#include <iostream>
#include <vector>

using namespace std;

int main() {
   long long int n;
    cin >> n;
    long long int sum= 0  ; 
    for (int i = 0; i < n-1; i++) {
        int input ; 
        cin >>input ;
        sum += input ;

    }
     long long int realsum = (n*(n+1))/2;
         cout<<realsum - sum <<endl;

    return 0;
}