import java.util.Scanner;

class LargestSumPrefix {
    int largestSubArraySum(int n, int[] arr) {
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int largestSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int subArraySum = i > 0 ? prefix[j] - prefix[i - 1] : prefix[j];
                largestSum = Math.max(largestSum, subArraySum);
            }
        }

        return largestSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        LargestSumPrefix obj = new LargestSumPrefix();
        System.out.println(obj.largestSubArraySum(n, arr));
        sc.close();
    }
}
