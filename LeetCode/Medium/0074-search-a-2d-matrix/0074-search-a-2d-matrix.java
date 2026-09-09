class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int first = 0;
        int last = m * n - 1;

        while (first <= last) {

            int mid = first + (last - first) / 2;

            int row = mid / n;
            int col = mid % n;

            if (matrix[row][col] == target) {
                return true;
            }
            else if (matrix[row][col] < target) {
                first = mid + 1;
            }
            else {
                last = mid - 1;
            }
        }

        return false;
    }
}