#include <iostream>

using namespace std;

void printMatrix(int arr[4][4],int n)
{
    for (int i =0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            cout<< arr[i][j]<<" ";
        }
        cout<< endl;
    }
}

int getCount(int a[4][4],int n,int k)
{
    int count =0;
    int i = n-1;
    int j =0;

    while(i>=0 && j<n)
    {
        if(a[i][j] <= k)
        {
            j++;
            count += i+1;
        }
        else
            i--;
    }
    return count;
}

int getKthSmallestElement(int matrix[4][4],int n ,int k)
{
    int l = matrix[0][0];
    int h = matrix[n-1][n-1];

    while(l<h){
        int mid = (l+h)/2;
        int cnt = getCount(matrix,n,mid);

        if(cnt >= k)
            h = mid;
        else
            l =mid+1;
    }
    return l;
}

int main()
{
    int mat[4][4] = { { 10, 20, 30, 40 },
                      { 15, 25, 35, 45 },
                      { 25, 29, 37, 48 },
                      { 32, 33, 39, 50 } };
    int k;
    cout<<"Matrix is :\n";
    printMatrix(mat,4);

    cout<<"Enter K :";
    cin >> k;

    cout<< getKthSmallestElement(mat,4,k);

    return 0;
}
