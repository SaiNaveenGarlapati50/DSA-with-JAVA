//binary search method in 2D arrays
//row and columns are sorted seperately
import java.util.Arrays;
class Binarysearch2D{
    public static void main(String[] args){
        int [][] arr={
            {10,20,30},
            {15,25,35},
            {26,36,47}
        };
        int target=3;
        System.out.println(Arrays.toString(binarysearch2D(arr,target)));
    }
    static int[] binarysearch2D(int[][] arr,int target){
        //In 2D arrays based on the last element in the first row(i.e;30) we will elemeinate the rows and columns
        //for every loop the last element will be changed and the loop continues until we find the target
        int row=0;
        int col=arr.length-1;
        while(row<arr.length && col>=0){
            /*case 1:
            if the last element in the first row is equal to target then the answer is found*/
            if(arr[row][col]==target){
                return new int[]{row,col};
            }
            /*case 2:
            if the last element(i.e;30) in the first row is greater than the target that means since the array is in sorted manner
            the elements(i.e;35,47) below that element will also greater than the target so the target will not present in that last column*/
            //so we can eliminate last column
            if(arr[row][col]>target){
                col=col-1;
            }
            /*case 3:
            if the last element in the first row(i.e;30) is lesser than the target that means since the array is in sorted manner the
            elements in that row (i.e;10,20) will also lesser thn he target so the target will not present in that row*/
            //so we can eliminate first row
            else{
                row=row+1;
            }
            //the loop will run until the target found 
            //if all rows and col are eliminated but the target is not there then it will give -1
        }
        return new int[]{-1,-1};//target is not present
    }
}
       