class Solution {
    public int minPathSum(int[][] grid) {
        
        int arr [] = grid[0].clone();
        
        for (int j = 1; j < grid[0].length; j++) {
            arr[j] += arr[j - 1];
        }

        for(int i = 1;i< grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                int left = Integer.MAX_VALUE;
                int up   = Integer.MAX_VALUE;
                if(j-1 >= 0 )left = arr[j-1];
                if(i-1 >= 0) up = arr[j];

                arr[j] = Math.min(left,up) + grid[i][j];
            }
        }
        return arr[grid[0].length-1];
    }
}