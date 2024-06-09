//binary search is used for the searching of the target in sorted arrays
//time complexity-O(logN),space complexity-constant O(1)
class Binarysearch{
    public static void main(String[] args){
        int [] arr={2,4,5,7,13,16,27,39,47};
        int target=27;
        System.out.println(binarysearch(arr,target));
    }
    static int binarysearch(int [] arr,int target){
        //In this binarysearch algorithm , we will first get the middle element of the array
        int start=0;
        int end=arr.length-1;  
        while(start<=end){
            int mid=start+(end-start)/2; //it is same as (start+end)/2 but in a precise way
            /*case 1:
            if the middle element is equal to the target then the answer is found*/
            if(arr[mid]==target){
                return mid;
            }
            /*case 2:
            if middle element is greater than the target since the array is sorted the elements after the middle elements are also
            will be greater than the target so the target will not present after the mid element*/
            //so we can neglect elements after the middle element
            if (arr[mid]>target){
                end=mid-1;
            }
            /*case 3:
            if middle element < target then the elements before the middle element will also be less than the target so the target will
            not present before the middle element*/
            //so we can neglect elements before the middle element
            else{
                start=mid+1;
            }
        }
        return -1;//target is not present in the array
    }
}