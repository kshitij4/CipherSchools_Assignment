#include <iostream>

using namespace std;

int fibbRecursive(int x)
{
    if(x <= 1)
        return x;
    return (fibbRecursive(x-1)+fibbRecursive(x-2));

}

int main()
{
    int x;
    cin>> x;
    cout<< fibbRecursive(x);
    return 0;
}
