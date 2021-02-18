#include <iostream>

using namespace std;

long long fact(int n)
{
    if(n<=1)
        return 1;
    return (n*fact(n-1));
}

long long UniquePaths(int r, int c)
{
    return fact(r + c - 2) / (fact(r - 1) * fact(c - 1));
}
int main()
{
    cout << UniquePaths(3, 7) << endl;
    return 0;
}
