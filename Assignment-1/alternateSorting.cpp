#include <iostream>
#include <algorithm>

using namespace std;

void alterSort(int a[],int n)
{
    sort(a,a+n);
    int i=0;
    int j=n-1;
    while(i<j)
    {
        cout<<a[j]<<" "<<a[i]<<" ";
        i++;
        j--;
    }
}

int main()
{
    int arr[]={1, 6, 9, 4, 3, 7, 8, 2};
    int n= sizeof(arr)/sizeof(arr[0]);
    alterSort(arr,n);

    return 0;
}
