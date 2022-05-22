#include <iostream>
#include <vector>
using namespace std;

int lowerBound(vector<int> A, int Val)
{
    for (int i = 1; i <= A.size(); i++)
    {
        if (Val == A[i])
            return Val;
        else if (Val > A[i - 1] && Val < A[i + 1])
            return A[i];
    }
    return -1;
}

int main()
{
    vector<int> A = {-1, -1, 2, 3, 5};
    int n;
    cin>>n;

    cout << lowerBound(A, n) << endl;
    return 0;
}