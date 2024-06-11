//example on cyclic sort
//finding missing number from the given array int range [1,N]
/*given an array {3,5,1,4} here it is range from [1,5] the missing element is 2*/
//after applying cyclic sort and sorted the array.
//how can we find the missing element??
//if condition:
/*we will use cyclic sort to sort the matrix and we know that in cyclic sort array of range[1,N] the index=value-1
so after sorting we will check if all the elements in the array obeys the condition or not if any index is false
then we will simply return value=index+1*/
//elese condition:
/*here there is another case if the array is given like {3,2,1,4} then here the missing element is 5 
we cant check its index because it will come out of index range so we can simply return N+1(N=arr.length).*/
import java.util.Arrays;
class Missingnumber{
    public static void main(String[] args){
        int[] arr={3,5,1,4};
        System.out.println(missingnumber(arr));
    }
    static int missingnumber(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1; //correct index=value-i
            if (arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        //array is sorted in while loop
        //now in for loop we are searching for missing number
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                return index+1;
            }
        }
        return arr.length+1;
    }
    //write swap to use in code
    static void swap(int[] arr,int first,int second){
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;
    }
}
