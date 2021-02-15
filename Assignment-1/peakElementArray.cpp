#include <iostream>
#include <vector>

using namespace std;

int peakElementNaive(int a[],int n)
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

int peakElementRecursive(int a[],int n,int l,int h)
{
    int m = (l + h)/2;

    if((m==0 || a[m-1]<=a[m]) && (m==n-1 || a[m+1] <= a[m]))
        return m;

    else if (m>0 && a[m-1]>a[m])
        return peakElementRecursive(a,n,l,(m-1));

    else
        return peakElementRecursive(a,n,m+1,h);
}

int findPeak(int a[],int n)
{
    return peakElementRecursive(a,n,0,n-1);
}

int main()
{
    int array[]= {10, 20, 15, 2, 23, 90, 67};
    int n = sizeof(array)/sizeof(array[0]);

    int idx = findPeak(array,n);

    cout<< array[idx];

    return 0;
}
