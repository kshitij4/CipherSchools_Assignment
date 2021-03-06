#include <iostream>
#include<string>
#include<vector>

using namespace std;

string getValue(char num)
{
    switch(num)
    {
    case '2':
        return "abc";
    case '3':
        return "def";
    case '4':
        return "ghi";
    case '5':
        return "jkl";
    case '6':
        return "mno";
    case '7':
        return "pqrs";
    case '8':
        return "tuv";
    case '9':
        return "wxyz";
    default :
        return "";
    }
}

vector<string> getCombinations(string value)
{
    if(value.length()==0)
    {
        vector<string> r ;
        r.push_back("");
        return r;
    }
    string firstChar = getValue(value.at(0));
    vector <string> restCombination = getCombinations(value.substr(1));
    vector<string> result;

    for(unsigned int i=0;i<firstChar.length();i++)
    {
        for(unsigned int j=0;j<restCombination.size();j++)
        {
            string out =firstChar.at(i) + restCombination.at(j);
            result.push_back(out);
        }
    }
    return result;

}

int main()
{
    vector<string> result = getCombinations("234");

    for(unsigned int  i=0;i<result.size();i++)
        cout<< result[i]<<" ";

    return 0;
}
