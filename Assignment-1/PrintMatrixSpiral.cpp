#include <iostream>

using namespace std;

void printSpiral(int arr[4][4], int i, int j, int r, int c)
{
    if (i >= r || j >= c)
        return;

    for (int a = j; a < c; a++)
        cout << arr[i][a] << " ";

    for (int a = i + 1; a < c; a++)
        cout << arr[a][c - 1] << " ";

    if ((c - 1) != i)
        for (int a = c - 2; a>= j; a--)
            cout << arr[r - 1][a] << " ";

    if ((c - 1) != j)
        for (int a = r - 2; a > i; a--)
            cout << arr[a][j] << " ";

    printSpiral(arr, i + 1, j + 1, r - 1, c - 1);
}


int main()
{

    int matrix[4][4] = { { 1, 2, 3, 4 },
                    { 5, 6, 7, 8 },
                    { 9, 10, 11, 12 },
                    { 13, 14, 15, 16 } };

    printSpiral(matrix, 0, 0, 4, 4);
    return 0;
}
