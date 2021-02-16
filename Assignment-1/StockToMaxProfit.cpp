#include <iostream>

using namespace std;

int getMaxProfit(int a[], int n)
{
    int profit = 0;
    int maxProfit = 0;

    if (n == 0)
    {
        return 0;
    }

    int minPrice = a[0];

    for(int i = 0; i < n; i++)
    {
        minPrice = min(minPrice, a[i]);

        profit = a[i] - minPrice;

        maxProfit = max(maxProfit, profit);
    }
    return maxProfit;
}


int main()
{

    int arr[] ={100, 180, 260, 310, 40, 535, 695};
    int n = sizeof(arr) / sizeof(arr[0]);

    cout << getMaxProfit(arr, n);

    return 0;
}
