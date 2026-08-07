class Solution {
    public int trap(int[] height) {

        int n = height.length;
        if (n <= 1)
            return 0;

        int l = 0;

        while (l < n && height[l] == 0)
            l++;

        if (l == n)    
            return 0;

        int r = l;

        int max_idx = l;   
        for (int i = l; i < n; i++) {
            if (height[i] >= height[max_idx])
                max_idx = i;
        }

        int area = 0;
        int max = height[l];

        while (r < max_idx) {

            while (r < max_idx && height[r] <= max)
                r++;

            if (r > max_idx)
                break;

            int base = r - l - 1;
            area += height[l] * base;

            l++;
            while (l < r) {
                area -= height[l];
                l++;
            }

            max = height[r];
        }

        r = n - 1;

        while (r > max_idx && height[r] == 0)
            r--;

        l = r;
        max = height[r];

        while (r > max_idx) {

            while (r > max_idx && height[r] <= max)
                r--;

            if (r < max_idx)
                break;

            int base = l - r - 1;
            area += height[l] * base;

            l--;
            while (l > r) {
                area -= height[l];
                l--;
            }

            max = height[r];
        }

        return area;
    }
}