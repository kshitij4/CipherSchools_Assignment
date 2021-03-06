#include <iostream>
#include<cstring>

using namespace std;

int countAllDecoding(char *digits, int n)
{
    if (n <=1)
        return 1;

    int count = 0;

    if (digits[n-1] > '0')
        count =  countAllDecoding(digits, n-1);

    if (digits[n-2] == '1' || (digits[n-2] == '2' && digits[n-1] < '7') )
        count +=  countAllDecoding(digits, n-2);

    return count;
}

int main()
{
    char digits[] = "121";
    int n = strlen(digits);

    cout << countAllDecoding(digits, n);

    return 0;
}
