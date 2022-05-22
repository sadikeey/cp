import java.util.Scanner;

public class Kadanes {
    int largestSubArraySum(int n, int[] arr){
        int cs = 0;
        int largestSum = 0;

        for(int i=0; i<n; i++){
            cs += arr[i];
            if(cs<0){
                cs = 0;
            } 
            largestSum = Math.max(largestSum, cs);
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

        Kadanes obj = new Kadanes();
        System.out.println(obj.largestSubArraySum(n, arr));
        sc.close();
    }
}