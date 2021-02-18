#include <iostream>

#define N 4

using namespace std;

void printGrid(int g[N][N])
{
    for(int i=0;i< N;i++)
    {
        for(int j=0;j< N;j++)
        {
            cout<<g[i][j]<<" ";
        }
        cout<<endl;
    }
}

bool isSafe(int a[N][N],int r,int k)
{
    for(int i =0;i<r;i++)
    {
        if(a[i][k]==1)
            return false;
    }

    int x=r;
    int y=k;

    while(x>=0 && y>=0)
    {
        if(a[x][y]==1)
            return false;
        x--;
        y--;
    }

    x=r;
    y=k;
    while(x>=0 && y<N)
    {
        if(a[x][y]==1)
            return false;
        x--;
        y++;
    }
    return true;
}

 bool placeNQueens(int g[N][N],int k)
{
    if(k == N)
    {
        printGrid(g);
        return true;
    }
    for(int i=0;i<N;i++)
    {
        if(isSafe(g,k,i)){
            g[k][i]=1;
            bool isPlaced = placeNQueens(g,k+1);
            if(isPlaced)
                return true;
            g[k][i]=0;
        }

    }
    return false;

}

int main()
{
    int grid[N][N]={0};

    //printGrid(grid);
    placeNQueens(grid,0);

    return 0;
}
