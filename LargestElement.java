class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 10, 5};
        int n = arr.length;
        int largest = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int arrayLargest = Math.max(arr[i], arr[j]);
                largest = Math.max(arrayLargest, largest);
            }
        }
        System.out.println(largest);
    }
}