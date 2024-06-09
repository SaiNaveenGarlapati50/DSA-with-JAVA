//finding target using linear search algorithm
//when the array is not sorted then we can use this linear search approach to get the required target
//time complexity-O(N)
class Linearsearch{
    public static void main(String[] args){
        int [] arr={1,4,2,6,4,10,9,67,34,23};
        int target=10;
        System.out.println(linearsearch(arr,target));
    }
    static int linearsearch(int[] arr,int target){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                //the for loop will check every element in the array and if any element matches with target then return index,i.e,i 
                return i;
            }
        }
        return -1;//if the target is not present inthe array then it will return -1
    }

}

