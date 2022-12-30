#include <iostream>
using namespace std;
int main(){
    /*int i, score[5],max;
    cout << "Enter 5 scores:\n";
    cin >> score[0];
    max=score[0];
    for (i=1; i<5; i++)
    {
        cin>>score[i];
        if(score[i] >max)
        max =score[i];
    }
    cout<< "the highest score is " << max << endl
        << "the scores and the differences form the highest are:\n";
    for(i=0;i<5;i++)
        cout<<score[i] << " off by" 
            << (max -score[i]) << endl;
    return 0;*/
    /*int  a[10];
    for (int i=0;i<10;i++){
        cout << "Enter the elements of the array: ";
        cin >> a[i];
    }*/
    /*int arr[]={2,4,6,8};
    for(int x : arr)
    cout << x;
    cout << endl;
    for (int i=0; i<4;i++) {
        cout <<arr[i] << " ";
    }*/
    /*int arr[5], i, max;
    cout<<"enter the 1st value of your array: ";
    cin >> arr[0];
    max = arr[0];
    for (i=1;i<5;i++) {
        cin >> arr[i];
        if(arr[i] > max)
        max = arr[i];
    }*/
    int arr[5], i , sum;
    sum=0;
    for(i=0;i<5;i++){
        cout<<"enter the element of array";
        cin>>arr[i];
        sum=sum+arr[i];
    }
    cout<<"sum= " <<sum;
}
