//it is also a sorting algorithm which sorts the array in parts
//time complexity:- worst case - O(N**2) and best case - O(N)
/*arr={5,3,4,1,2}
there will be i passes and j is the index upto which the array is sorted
i will be < arr.length-1 and j=i+1
At 1st pass,only upto 1st index elements will be sorted
at 2nd pass,only upto 2nd index elements will be sorted
at 3rd pass,only upto 3rd index elements will be sorted
at 4th pass,only upto 4th index elements will be sorted*/
/*OPERATION:-
lets take an array {5,3,4,1,2}
1st pass:-i=0,j=i+1=1
          the j will be at 1st index(i.e;3)
          it will compare 1st and 0th index (3>5)-false.since we want sorted array we have to place least element in starting indexes
          so swap 3 and 5.
          now array becomes {3,5,4,1,2}
2nd pass:-i=1,j=i+1=2
          the j will be at 2nd index(i.e;4)
          it will compare 2nd and 1st index (4>5)-false.so we have to swap the arr become {3,4,5,1,2}
          now it will compare 1st and 0th index(4>3)-true.it is true so we can break and can go to next pass
          the array after 2nd pass is {3,4,5,1,2}
3rd pass:-i=2,j=i+1=3
          the j will be at 3rd index(i.e;1)
          it will compare 3rd and 2nd index(1>5)-false.so we have to swap them now arr become {3,4,1,5,2}
          now it will compare 2nd and 1st index(1>4)-false.swap elements {3,1,4,5,2}
          now it will compare 1st and 0th index(1>3)-false.swap elements {1,3,4,5,2}
          the array after 3rd pass is {1,3,4,5,2}
4th pass:-i=3,j=i+1=4
          the j will be at 4th index(i.e;2)
          it will compare 4th and 3rd index(2>5)-false.swap elements {1,3,4,2,5}
          now it will compare 3rd and 2nd index(2>4)-false.swap elements {1,3,2,4,5}
          now it will compare 2nd and 1st index(2>3)-false.swap elements {1,2,3,4,5}
          now it will compare 1st and 0th indes(2>1)-true. break
          final sorted array is - {1,2,3,4,5}*/
import java.util.Arrays;
class Insertionsort{
    public static void main(String[] args){
        int [] arr={5,3,4,1,2};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //insertion sort
    static void insertionsort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j>0;j--){
                if (arr[j]<arr[j-1]){
                    swap(arr,j-1,j);
                }
                else{
                    break;
                }
            }
        }
    }
    //write swap function to use in code
    static void swap(int[] arr,int first,int second){
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;
    } 
}
          