public boolean searchMatrix(int[][] matrix, int target) {
        for(int row = 0; row < matrix.length;){
            if(matrix.length == 1 && matrix[row].length == 1 && matrix[row][0] != target)
                return false;
            if(matrix[row][matrix[row].length - 1] >= target){
                if(binarySearch(matrix[row], target) == -1){
                    return false;
                }
                return true;
            }
            else{
                row++;
            }
        }
        return false;
    }

    int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            // Check if x is present at mid
            if (arr[m] == x)
                return m;
 
            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
 
        // if we reach here, then element was
        // not present
        return -1;
    }
