import java.util.Arrays;

class Solution {

    // Rotate array to RIGHT by k positions
    public void rotateRight(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;

        k = k % n;

        // Step 1: store last k elements
        int[] temp = Arrays.copyOfRange(arr, n - k, n);

        // Step 2: shift remaining elements to right
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        // Step 3: put temp elements at start
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
        /* OR
        int n=nums.length;
        if(n==0) return;

        k=k%n;
        int[] temp= new int[n];
        shift elements into temp based on right shift index
        for(int i=0;i<n;i++){
            temp[(i+k)%n] = nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }*/
    }

    // Rotate array to LEFT by k positions
    public void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;

        k = k % n;

        // Step 1: store first k elements
        int[] temp = Arrays.copyOfRange(arr, 0, k);

        // Step 2: shift remaining elements to left
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // Step 3: put temp elements at end
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        sol.rotateRight(arr, k);
        System.out.println("Right Rotation: " + Arrays.toString(arr));

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};

        sol.rotateLeft(arr2, k);
        System.out.println("Left Rotation: " + Arrays.toString(arr2));
    }
}

/* #output:
Right Rotation: [6, 7, 1, 2, 3, 4, 5]
Left Rotation: [3, 4, 5, 6, 7, 1, 2]
*/