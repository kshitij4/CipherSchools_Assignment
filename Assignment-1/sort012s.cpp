#include <iostream>

using namespace std;

void printArray(int a[],int n)
{
    for(int i=0;i<n;i++)
        cout<<a[i]<<" ";
}

void sortArray(int a[],int n)
{
    int l=0,m=0,h=n-1;
    while(m<=h)
    {
        if( a[m]==0 )
        {
            swap(a[m],a[l]);
            l++;
            m++;
        }
        else if( a[m]==1 )
        {
            m++;
        }
        else
        {
            swap(a[m],a[h]);
            h--;
        }
    }
}

int main()
{
    int arr[]={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
    int n = sizeof(arr)/sizeof(arr[0]);

    sortArray(arr,n);
    printArray(arr,n);

    return 0;
}
