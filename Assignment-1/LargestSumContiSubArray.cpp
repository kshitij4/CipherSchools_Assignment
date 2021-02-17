#include <iostream>

using namespace std;

int LargestSumSubArray(int a[], int n)
{
    int max = INT_MIN, maxCurr = 0;

    for (int i = 0; i < n; i++)
    {
        maxCurr = maxCurr + a[i];
        if (max < maxCurr)
            max = maxCurr;

        if (maxCurr < 0)
            maxCurr = 0;
    }
    return max;
}

int main()
{
    int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
    int n = sizeof(arr)/sizeof(arr[0]);

    int LargestSum = LargestSumSubArray(arr, n);

    cout << LargestSum;
    return 0;
}
