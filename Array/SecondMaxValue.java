public class SecondMaxValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 8, 7};
        int mx = Integer.MIN_VALUE;
        int smx = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                smx = mx;  // Update second maximum before updating maximum
                mx = arr[i];
            } else if (arr[i] > smx && arr[i] < mx) {
                smx = arr[i];
            }
        }

        System.out.println(smx);
    }
}
