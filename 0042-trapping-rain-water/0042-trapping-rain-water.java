class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;

        int l_max = height[l];
        int r_max = height[r];

        int water = 0;

        while (l < r) {

            if (l_max < r_max) {

                l++;

                if (height[l] >= l_max) {
                    l_max = height[l];
                } else {
                    water += l_max - height[l];
                }

            } else {

                r--;

                if (height[r] >= r_max) {
                    r_max = height[r];
                } else {
                    water += r_max - height[r];
                }
            }
        }

        return water;
    }
}