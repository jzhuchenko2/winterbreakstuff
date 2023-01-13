#include <iostream>
#include <conio.h>
#include <ctime>
#include <iomanip>

using namespace std;
/*
int main() {
    int sales[5];
    int sale = 0;

    for (int i = 0; i < 5; i++) {
        cout << "Enter Sales for store #" << i + 1 << endl;
        cin >> sale;
        sales[i] = sale / 100;
    }
    for (int j = 0; j < 5; j++) {
        cout << "Store # " << j + 1;
        for (int f = 0; f < sales[j]; f++) {
        cout << "*";
        }
        cout << endl;
    }
}
*/
void display(int n[][2]){
    cout << "enter the elements of 2 dim array \n";
    for (int i=0;i<3;i++){
        for(int j=0;j<2;j++){
            cout << "n[" << i << "][" << j << "]= " << n[i][j] << "\n";
        }
    }
}
int main() {
    int arr[3][2];
    for (int i=0;i<3;i++) {
        for (int j=0;j<2;j++) {
            cout << "enter the elements: ";
            cin >> arr[i][j];
        }
    }
    display;
}