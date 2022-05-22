#include <iostream>
using namespace std;

int binarySearch(int arr[], int n, int key)
{

    int s = 0;
    int e = n - 1;

    while (s <= e)
    {
        int mid = (s + e) / 2;
        if (arr[mid] == key)
            return mid;
        else if (arr[mid] > key)
            e = mid - 1;
        else
            s = mid + 1;
    }

    return -1;
}

int main()
{
    int arr[] = {10, 20, 30, 40, 50, 60, 79};
    int n = sizeof(arr) / sizeof(int);
    int key;
    cout << "Key = ";
    cin >> key;

    int index = binarySearch(arr, n, key);
    if (index != -1)
        cout << "Element " << key << " is present at index " << index << "." << endl;
    else
        cout << "Element not found" << endl;

    return 0;
}