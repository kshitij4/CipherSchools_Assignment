#include <iostream>
#include <vector>

using namespace std;

int peakElement(int a[],int n)
{
    if(n==1)
        return 0;
    if(a[0] >= a[1])
        return 0;
    if(a[n-1] >= a[n-2])
        return n-1;
    for(int i=1;i<n-1;i++)
    {
        if(a[i]>a[i-1] && a[i]>a[i+1])
            return i;
    }
    return -1;
}

int main()
{
    int array[]= {10, 20, 15, 2, 23, 90, 67};
    int n = sizeof(array)/sizeof(array[0]);

    int idx = peakElement(array,n);

    cout<< array[idx];

    return 0;
}
