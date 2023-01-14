//number 1
/*#include <iostream>
    #include <stdio.h>
    using namespace std;
    int posc(char suit[], char fc, int sz)
        {
            int i = 0;
            do
            {
                if (toupper(fc) == suit[i]) return i;
                else
                i = i + 1;
            } 
            while (i < sz);
            cout << "\n Character " << fc << " not available in list";
            return 99;
        }
    int main()
    {
        char suit[] = { 'S', 'D', 'C', 'H' };
        char fc;
        int res;
        int sz = size(suit);
        cout << "\n Enter a character: ";
        cin >> fc;
        res = posc(suit, fc, sz);
        cout << "\n We found fc: " << res;
        return 0;
    }*/
//number 2
/*#include <iostream>
using namespace std;

int main()
{
    int a, b, temp;
    cout << "Before swapping, enter 2 integers: " << endl;
    cin >> a >> b;
    cout << "a = " << a << ", b = " << b << endl;
    temp = a;
    a = b;
    b = temp;
    cout << "\nAfter swapping." << endl;
    cout << "a = " << a << ", b = " << b << endl;
        return 0;
}*/
//number 3
#include <iostream>
using namespace std;

int main() {

  int mileage1,mileage2,age2, age1, cost1,cost2,b,car1,car2;
  cout << "Enter mileage and age for car 1: \n";
  cout << "Enter mileage and age for car 2: \n";
  cin >> mileage1 >> age1 >> mileage2 >> age2;

  cost1= mileage1 * .8 + age1 * .3;
  cost2= mileage2 * .8 + age2 * .3;

if(cost1>cost2){
    b = car2;
    cout << "The better car to buy is: "  << "car2";
}
if(cost2>cost1){
    b = car1;
    cout << "The better car to buy is: "  << "car1";
}
}
