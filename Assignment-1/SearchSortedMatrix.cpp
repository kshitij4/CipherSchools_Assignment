#include <iostream>

using namespace std;

void findElement(int a[4][4],int n,int k)
{
    int i = n-1;
    int j = 0;

    while(i>=0 && j < n)
    {
        if(a[i][j] == k)
        {
            cout<< "Found at (" << i <<","<< j <<")";
            return;
        }
        if(a[i][j] > k)
            i--;
        else
            j++;
    }
    cout<<"Not Found";
}

int main()
{
    int mat[4][4] = { {10, 20, 30, 40},
                      {15, 25, 35, 45},
                      {27, 29, 37, 48},
                      {32, 33, 39, 50}};
    int x = 35;
    int n = sizeof(mat)/sizeof(mat[0]);
    findElement(mat,n,x);

    return 0;
}
