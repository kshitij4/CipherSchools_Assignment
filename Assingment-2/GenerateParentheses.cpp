#include <iostream>

using namespace std;

void generateParenthesis(int left,int right,string p)
{
    if(left > right)
        return ;

    if( left == right )
    {
        cout<< p <<endl;
    }
    if( left >0)
    {
        generateParenthesis(left -1 ,right ,p +"(");
    }
    if(right > 0)
    {
        generateParenthesis(left , right-1,p + ")");
    }

}

int main()
{
    int x;
    cout<<"Enter the no of pairs: ";
    cin>> x;

    generateParenthesis(x,x," ");

    return 0;
}
