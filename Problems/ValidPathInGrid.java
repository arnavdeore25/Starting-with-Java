/*

You are given two integers m and n, representing the number of rows and columns of a grid.

Construct any m x n grid consisting only of the characters '.' and '#', where:

'.' represents a free cell.
'#' represents an obstacle cell.
A valid path is a sequence of free cells that:

Starts at the top-left cell (0, 0).
Ends at the bottom-right cell (m - 1, n - 1).
Moves only:
Right, from (i, j) to (i, j + 1), or
Down, from (i, j) to (i + 1, j).
Return any grid such that there is exactly one valid path from the top-left cell to the bottom-right cell.

*/

import java.util.Arrays;

class Solution {

  public String[] createGrid(int m, int n) {
    char[][] g = new char[m][n];
    for (int i = 0; i < m; i++) 
    {
        Arrays.fill(g[i], '#');
    }
    Arrays.fill(g[0], '.');
    for (int i = 0; i < m; i++) 
    {
        g[i][n - 1] = '.';
    }
    String[] ans = new String[m];
    for (int i = 0; i < m; i++) 
    {
        ans[i] = new String(g[i]);
    }
    return ans;
  }

  public static void main(String[] args) {
    int m = 2;
    int n = 3;

    Solution solution = new Solution();
    for (String row : solution.createGrid(m, n)) 
    {
        System.out.println(row);
    }
  }
}