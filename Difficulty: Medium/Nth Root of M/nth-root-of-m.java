class Solution {
    public int nthRoot(int n, int m) {
        int low = 1;
        int high = m;
        if (m==0)return 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long ans = 1;

            for (int i = 0; i < n; i++) {

                // Check before multiplication to avoid overflow
                if (ans > m / mid) {
                    ans = m + 1;
                    break;
                }

                ans *= mid;
            }

            if (ans == m) {
                return mid;
            }

            if (ans < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}