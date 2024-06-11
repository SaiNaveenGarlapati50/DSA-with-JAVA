//when the array is given in range [0,N] or [1,N] then we will use cyclic sort
//It is very important sorting algorithm its time complexity is O(N)
/*How can we sort an array using cyclic sort ??
lets take an example array={3,5,2,1,4} its in range[1,5]
here we know that after sorting the array will become {1,2,3,4,5} and the indexes are 0,1,2,3,4 respectively.
so here for 1 - index is 0
        for 2 - index is 1
        for 3 - index is 2
        for 4 - index is 3
        for 5 - index is 4
so from above we can say that the******Index=value-1*****
process:-
now from the given array {3,5,2,1,4}
we have to check if every index has the value-1 element or not if the element is not there then swap with the correct position*/

/*working:-
{3,5,2,1,4}- indexes are 0,1,2,3,4
1)check the first element= 3 it should be in the index=3-1=2 (index=value-1) 
  so now swap the 2nd index with 0th index then array become {2,5,3,1,4}
2)check the first element=2 it should be in the index=2-1=1
  so now swap the 1st index with 0th index the array become {5,2,3,1,4}
3)check the first element=5 it should be in the index=5-1=4
  so now swap the 4th index with 0th index then array become {4,2,3,1,5}
4)check the first element=4 it should be in the index=4-1=3
  so now swap the 3rd index with 0th index then array become {1,2,3,4,5}
the final sorted array will be = {1,2,3,4,5}*/
import java.util.Arrays;
class Cyclicsort{
    public static void main(String[] args){
        int[] arr={1,4,6,3,2,7,5,8};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicsort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1; //correct index=value-i
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    //write swap to use in code
    static void swap(int[] arr,int first,int second){
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;
    }
}
