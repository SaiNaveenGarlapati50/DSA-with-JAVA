//floor of a number:-largest element in an array smaller than the target
/*arr={2,3,5,9,14,16,18},target=15
floor of target is the largest element in an array smaller than target . this means the elements smaller than the target {2,3,5,9,14} 
in this the largest element is the floor of target.largest element is 14*/
//we have to perform the same code an procedure but at the last we have to return end
class Floor{
    public static void main(String[] args){
        int [] arr={2,3,5,9,14,16,18};
        int target=15;
        System.out.println(floor(arr,target));
    }
    static int floor(int[] arr,int target){
        //we have to perform the same operation as in ceil but we will return end instead of start after the while loop
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }

}
