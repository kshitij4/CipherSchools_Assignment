#include <iostream>

using namespace std;

int getWater(int a[],int n)
{
    int left[n];
    int right[n];
    left[0]= a[0];
    right[n-1] =a[n-1];

    for(int i=1;i<n;i++)
    {
        if(left[i-1] > a[i] )
            left[i] = left[i-1];
        else
            left[i] =a[i];
    }

    for(int i=0;i<n-1;i++)
    {
        if(right[i+1]>a[i])
            right[i] = right[i+1];
        else
            right[i] =a[i];
    }
    int totWater =0;

    for(int i=0;i<n;i++)
    {
        totWater +=  min(left[i],right[i])-a[i];
    }
    return totWater;
}

int main()
{
    int arr[]={3, 0, 2, 0, 4};
    int n= sizeof(arr)/sizeof(arr[0]);

    cout<< getWater(arr,n);
    return 0;
}
