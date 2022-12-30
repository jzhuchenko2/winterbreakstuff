#include <iostream>
#include <bits/stdc++.h>
using namespace std;
void printPermutation(vector <char> str, int pos)
{
    if(pos == str.size())
    {
        for(auto i : str)
        cout<<i;
        
        cout<<endl;
        return;
    }
    
    /* if string character is numeric ignore it and move on to next character */
    if (str[pos] >= '0' && str[pos] <= '9') 
    {
        printPermutation(str, pos + 1);
        return;
    }
    
    str[pos] = tolower(str[pos]);
    printPermutation(str, pos + 1);
    
    str[pos] = toupper(str[pos]);
    printPermutation(str, pos + 1);
}
int main()
{
    /* input the word */
    string input = "medium-one";
    /* convert input string to vector  */
    vector <char> str(input.begin(),input.end());
    
    printPermutation(str,0);
    return 0;
}


