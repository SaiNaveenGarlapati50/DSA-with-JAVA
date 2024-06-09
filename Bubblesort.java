//It is a sorting algorithm used to sort the array
//time complexity: best case-O(N) , worst case -O(N**2)
/*How this algorithm work?
lets take an array={3,1,5,4,2}
it will check every elemenet with its before element and if it is not in increasing order then the both will swap
step 1:- it will check 1st,2nd element(i.e;3,1);3<1(false) so it is not in order so they will swap.array will become {1,3,5,4,2}
         it will check 2nd,3rd element(i.e;3,5);3<5(true)they are in correct order so no need to swap.array will be same{1,3,5,4,2}
         it will check 3rd,4th element(i.e;5,4);5<4(false)so it is not in order so we need to swap.array will become {1,3,4,5,2}
         it will check 4th,5th element(i.e;5,2);5<2(false)so it is not in order so we have to swap.array will become{1,3,4,2,5}
after the first step the last element will be correct value so it can be fixed
the operation will again repeated to {1,3,4,2,5} array and if it not get sorted in step 2
then it will again do operation until the array get sorted
//NOTE:-after every step the last element will become fixed value*/
import java.util.Arrays;
class Bubblesort{
    public static void main(String[] args){
        int[] arr={2,3,1,5,4,8,6,9,7};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr){
        for (int i=0;i<arr.length;i++){ // the opertion will be step-i times // i in no of steps taken to sort the array
            for (int j=1;j<arr.length-i;j++){ //here we were reducing (arr.length-i) last element because for every i-th step the i-th last element will be fixed
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}