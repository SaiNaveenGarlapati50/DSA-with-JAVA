//find out the maximum element in the array
//it is also work using linear search method
class Max{
    public static void main(String[] args){
        int [] arr={2,3,5,13,56,73,19,43,100,23};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int max=arr[0];//first we have to asssume that the first elemnt in the array is max element
        //then using for loop we have to check if every element is smaller than the first element
        //if any element is greater than the first element then the max element will be replaced to that element and the for loop will continue till the end with the same process
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}