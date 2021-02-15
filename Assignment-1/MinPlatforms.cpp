#include <iostream>
#include <algorithm>

using namespace std;

int getNoofPlatforms(int a[],int d[],int n)
{
    sort(a,a+n);
    sort(d,d+n);
    int platform = 1;
    int totPlatform = 1;
    int i =1;
    int j=0;
    while( i<n && j<n)
    {
       if(a[i] <= d[j])
       {
           platform++;
           i++;
       }
       else
       {
           platform -- ;
           j++;
       }
       totPlatform = max(totPlatform,platform);
    }
    return totPlatform;
}

int main()
{
    int arr[]={900, 940, 950, 1100, 1500, 1800} ;
    int dep[]={910, 1200, 1120, 1130, 1900, 2000} ;
    int n= sizeof(arr)/sizeof(arr[0]);

    cout<< getNoofPlatforms(arr,dep,n);

    return 0;
}
