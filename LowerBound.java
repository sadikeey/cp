import java.util.Scanner;

class LowerBound {
    int lowBound(int n, int[] arr, int val) {

        for (int i = 1; i <= n; i++) {
            if (val == arr[i])
                return val;
            else if (val > arr[i-1] && val < arr[i + 1])
                return arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int val = sc.nextInt();

        LowerBound obj = new LowerBound();
        System.out.println(obj.lowBound(n, arr, val));
        sc.close();
    }
}