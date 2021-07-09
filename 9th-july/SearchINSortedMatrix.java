/*
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row
*/

class SearchInSortedMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null){
            return false;
        }
         int m= matrix.length;
        if(m==0){
            return false;
        }
        int n= matrix[0].length;
        //System.out.println(m + " " +n);
        if(m==0 || n==0){
            return false;
        }
        int row= 0, col= n-1;
        while(row < m && col >=0){
            if(matrix[row][col] == target){
                return true;
            }
            if(matrix[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        
        return false;
    }
}
