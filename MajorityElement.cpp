#include <iostream>

using namespace std;

int major(int a[],int n)
{
    int cnt,maxc=0;
    int idx=-1;;
    for(int i=0;i<n;i++)
    {
        cnt =0;
        for(int j=0;j<n;j++)
        {
            if(a[i] == a[j])
                cnt++;
            if(cnt > maxc)
            {
                maxc=cnt;
                idx=i;
            }
        }
    }
        if(maxc > n/2)
            return a[idx];
        else
            return -1;
}

int main()
{
    int arr[]={3, 3, 4, 2, 4, 4, 2, 4};
    int n = sizeof(arr)/sizeof(arr[0]);
    int res = major(arr,n);
    if(res == -1)
        cout<<"No Majority Element";
    else
        cout<< res;

    return 0;
}
