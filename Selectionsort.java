//It is also a method use to sort the array
//time complexity:O(N**2)
//In selection sort we will select the max element and place it in the correct position(i.e;last index)
/*How the selection sort works?
lets take an array {5,2,3,1,4}
step 1:we have to find the max element from the array and swap it with the last element because array is sorted.here max element 
is 5 swap it with last element then array will become {4,2,3,1,5} since the last element is now fixed we can check similarly for the 
remaining array
step 2:only check in{4,2,3,1} same process will be repeated until the array is sorted*/
import java.util.Arrays;
class Selectionsort{
    public static void main(String[] args){
        int [] arr={5,2,3,1,4};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //selection sort
    static void selectionsort(int[] arr){
        for (int i=0;i<arr.length;i++){  // i is the steps in the selction sort for every i-th step the i-th element form the array will be fixed
            int last=arr.length-i-1;
            int max=getmax(arr,0,last);
            swap(arr,max,last);
        }
    }
    //write method swap to use anywhere in the code
    static void swap(int[] arr,int first,int second){
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;
    }
    //find max element
    static int getmax(int[] arr,int start,int end){
        int max=start;
        for (int i=0;i<=end;i++){
            if (arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
}

