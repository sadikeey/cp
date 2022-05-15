#include<iostream>
using namespace std;

int linearSearch(int arr[], int n, int key){
    for(int i = 0; i < n; i++){
        if(arr[i] == key){
            return i;
        }
    }
    return -1;
}

int main()
{
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    int n = sizeof(arr)/sizeof(int);
    int key;
    cin>>key;
    
    int index = linearSearch(arr, n, key);
    if(index != -1)
        cout<<"Element " << key << " is present at index " << index << endl;
    else
        cout<<"Element not found";
}