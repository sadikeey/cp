#include <iostream>
using namespace std;

void printArray(int arr[]){
    
    cout << "In funtion " << sizeof(arr) << endl;
}

int main()
{
    int arr[] = {1, 3, 4, 5, 6, 8};

    int sizeOfArray = sizeof(arr) / sizeof(int);
    printArray(arr);

    cout << "In main " << sizeOfArray << endl;
}