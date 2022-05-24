import java.util.*;

class SortedPairSum {
    static int[] ans = new int[2];

    void pairSum(int n, int[] arr, int x) {

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum = arr[i] + arr[j];
                if ((x < (sum + 5)) && x > (sum - 5)) {
                    ans[0]=arr[i];
                    ans[1]=arr[j];
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int x = sc.nextInt();

        SortedPairSum ob = new SortedPairSum();
        ob.pairSum(n, arr, x);

        for(int i=0; i<2; i++)
            System.out.println(ans[i]);
        
        sc.close();
    }
}