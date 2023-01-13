#include <bits/stdc++.h>
using namespace std;
int main()
{
    string str = "COSC++";
  
    reverse(str.begin(), str.end());
  
    cout << str;
    return 0;
}

#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
char a[100];
int i,count=1;
cout<<"Enter a string:";
gets(a);
for(i=0;a[i]!='\0';++i)
{
if(a[i]==' ')
count++;
}
cout<<"\nThere are "<<count<<" words in the given string";
return 0;
}
#include <iostream>
#include<stdlib.h>
using namespace std;
 
int main()
{ 
	string s1,s2; 
	cout<<"String 1 : ";
	cin>>s1;
	cout<<"String 2 : ";
	cin>>s2;
	
	if(s1==s2)
	{
		cout<<"Equal";
	}
	else
	{
		cout<<"Not Equal";
	}
}
