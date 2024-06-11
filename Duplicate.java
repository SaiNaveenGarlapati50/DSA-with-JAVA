//it will be same as missing number in the array question but here we have to return the element not the index
class Duplicate{
    public static void main(String[] args){
        int[] arr={1,4,2,5,3};
        System.out.println(duplicate(arr));
    }
    //using cyclic sort sorting the array
    static int duplicate(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;    //corrrect index
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        //searching for duplicate
        for(int index=0;index<arr.length;index++){
            if (arr[index]!=index+1){   //if any value is not in the correct index
               if (arr[arr[index]-1]==arr[index]){  //if the duplicate is present in the correct index and also here
                   return arr[index];
               }
            }
        }
        return -1;
    }
    //swap function
    static void swap(int[] arr,int first,int second){
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;
    }

}
