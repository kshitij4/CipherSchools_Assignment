#include <iostream>

using namespace std;

void sort01(int a[],int n)
{
   int l=0,r=n-1;
   while(l<=r)
   {
       if(a[l]==1)
       {
           if(a[r]==1)
                r--;
           else
            {
                swap(a[l],a[r]);
                l++;
                r--;
            }
       }
       else
            l++;
   }
}

int main()
{
    int arr[]={0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
    int n=sizeof(arr)/sizeof(arr[0]);

    sort01(arr,n);

    for(int i=0;i<n;i++)
        cout<<arr[i]<<" ";
    return 0;
}
