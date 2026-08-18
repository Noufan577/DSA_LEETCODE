class Solution {
    public int dfs(int[][] grid,int i,int j)
    {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0)
            return 0;
        int area=1;

        grid[i][j]=0;

        area+=dfs(grid,i,j+1);
        area+=dfs(grid,i,j-1);
        area+=dfs(grid,i+1,j);
        area+=dfs(grid,i-1,j);

        return area;
        
        
    }

    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int max=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    max=Math.max(max,dfs(grid,i,j));
                }
            }
        }
        return max;
    }
}