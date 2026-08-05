class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int m=0;
        while(l<r)
        {
            int base=r-l;
            int area=Math.min(height[l],height[r])*base;
            m=Math.max(m,area);

            if(height[l]<height[r])
                l++;
            else
                r--;
        }
        return m;
    }
}