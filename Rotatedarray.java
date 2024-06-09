//we will use binary search method to search in a rotated array
/*what is a rotated array?
lets take a normal sorted array={2,4,5,7,8,9,10,12}
after one rotation the last element will come to first and all the elements will move to right one step then array will become
{12,2,4,5,7,8,9,10}
after second rotation
{10,12,2,4,5,7,8,9}
like this so many rotations will be their in a single array this is called rotated array.*/

/*the main question is how can we search in a rotated array
step 1:we have to **find the larger element** in the array because from that element only the rotation will be takes place
step 2:apply binary search in the array based on the large element.*/
class Rotatedarray{
    public static void main(String[] args){
        int [] arr={3,4,5,6,7,0,1,2};
        int target=1;
        System.out.println(search(arr,target));
    }
    //finding the target elememt using the large element and binary search
    static int search(int[] arr,int target){
        int large=findlarge(arr); //assign index of larger element to a variable named "large"
        if (large==-1){ //means that the array is not rotated
            return binarysearch(arr,target,0,arr.length-1);
        }
        if(arr[large]==target){ // if the target element is the large then simply we have found answer
            return large;
        }
        /*{3,4,5,6,7,0,1,2}
        the large element=7 and the target = 1
        case 5:
            if the target<startelement(i.e;arr[0]); then since it is rotated array the elements before the large element
            can be neglected as all the numbers before the large are larger than start //start=large+1
        case 6:
            if the target>startelement ; then since it is rotated array the elements after the large element can be
            neglected because all the numbers after the large are smaller than start. //end=large-1;*/
        if(target<arr[0]){  //case 5
            return binarysearch(arr,target,large+1,arr.length-1);
        }
        return binarysearch(arr,target,0,large-1); //case 6
    }
    
    //just write binary search method to use in code
    static int binarysearch(int[] arr,int target,int start,int end){
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
        return -1;
    }
    //finding larger number
    static int findlarge(int[] arr){
        int start=0;
        int end=arr.length-1;
        /*let us assume the larger element is near middle element
        throughout the array will be ascending order but where the rotation takes place(i.e;at larger number) they will be
        in the descending order so we can get two cases:-
        case 1:-
        if middle element > its next element; then middle element is our required larger element(because only there descending order takes place)
        case 2:-
        if middle element < its previous element; then that previous element is our required large element(because only there descending order takes place)*/
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){  //case 1
                return mid;
            }
            if(arr[mid]<arr[mid-1]){  //case 2
                return mid-1;
            }
            // if the larger number is not present near the middle then the first two cases will be failed so we have to take another two cases
            /*case 3:-
            now we will compare the middle element with start element
            if middle element is greater than the start element since it is rotated array so the elements before middle element will be also
            greater than the start element so we can neglect elements before middle element.
            case 4:-
            if middle element is less than the start element since it is rotated array the elements after middle element will be also
            less than the start element so we can neglect elements after middle element*/
            if (arr[mid]>arr[start]){  //case 3
                start=mid+1;//only take elements after middle element,neglect all the elements before middle element.
            }
            else{ //case 4
                end=mid-1;//only take elements before middle element,neglect all the elements after middle element.
            }
        }
        return -1;//if array is not rotated sort;
    }
}