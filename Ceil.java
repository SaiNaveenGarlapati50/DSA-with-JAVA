//ceil of a number:-smallest number in array which is greater than the target
//we will use binary search to get the answer
//arr={2,3,14,15,16,20,21},target=17
/*ceil of the target is first we have to get smallest numbers in the array greater than the target(i.e;17) those are {20,21}
from those greatest numbers we have to find out smallest among them therefore 20  is the smallest so 20 is the ceil of the target 17.like this
the process will be done*/
class Ceil{
    public static void main(String [] args){
        int [] arr={2,3,14,15,16,20,21};
        int target = 17;
        System.out.println(ceil(arr,target));
    }
    static int ceil(int[] arr,int target){
        //how the process will be taken place
        /*{2,3,14,15,16,20,21} middle element =15 
        /*case 1:
        we have to find the mid of the array and check whether it is greater than target since it is sorted array the elements 
        after middle element are also greater than the target so we can neglect those elements.
        //no,middle element(15)<target(17) it does not satisfy this case so we can get into next case
        /*case 2:
        check whether the middle element is lesser than the target since it is sorted the elements before the middle element
        are also will be lesser than the middle element so we can neglect those elements.
        /*middle element(15)<target(17) it staisfies this case so we can remove elements before middle element the the array become
        {16,20,21}
        we will again check step 1 and step 2 for this array amd we will get the answer finally*/
        //if the element is not found simply return start
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
                return mid;//if the target==middle element
            }
        }
        return start;//if the answer not there then return start we will get the answer
    }
}
