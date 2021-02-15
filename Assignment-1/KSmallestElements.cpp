#include <iostream>

using namespace std;

void getKSmallest(int a[],int n,int k)
{
    for(int i=k; i<n; i++)
    {

        int max = a[k -1];
        int maxPos = k - 1;

        for(int j = k - 2; j >= 0 ; j--) {
            if(a[j] > max)
            {
                max = a[j];
                maxPos = j;
            }
        }
        int curr=a[i];
        if(max >curr)
        {
            int m = maxPos;
            while(m < k-1)
            {
                a[m] =a[m + 1];
                m++;
            }
            a[k-1] =curr;
        }
    }
    for(int i=0;i< k ;i++)
        cout<<a[i]<<" ";

}

int main()
{
    int arr[]={4, 2, 6, 1, 5};
    int n= sizeof(arr)/sizeof(arr[0]);
    int k=3;

    getKSmallest(arr,n,k);


    return 0;
}
