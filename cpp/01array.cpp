#include<iostream>
using namespace std;

int main() {
    int arr[100];

    int n;
    cout<<"Enter size of arr. = ";
    cin>>n;
    
    arr[0] = -1;

    cout<<"Enter array = ";
    for(int i = 1; i<n; i++){
        cin>>arr[i];
        arr[i] = arr[i] * 2;
    }

    for(int i = 0; i<n; i++){
        cout<<arr[i]<<" ";
    }
}