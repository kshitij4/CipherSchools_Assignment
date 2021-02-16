#include<iostream>

using namespace std;

int searchRotatedArr(int arr[],int n,int x)
{
	int low=0,high=n-1;
	while(low<=high)
	{
		int mid=(low+high)/2;
		if(arr[mid]==x)
			return mid;
		if(arr[mid]>arr[low])
		{
			if(x >= arr[low] && x < arr[mid])
				high=mid-1;
			else
				low=mid+1;
		}
		else
		{
			if(x > arr[mid] && x <= arr[high])
				low=mid+1;
			else
				high=mid-1;
		}
	}
	return -1;
}

int main()
{
	int arr[]={5, 6, 7, 8, 9, 10, 1, 2, 3};

	int n =sizeof(arr)/sizeof(arr[0]);

	int key =3;

	cout << searchRotatedArr(arr,n,key);
	return 0;
}
