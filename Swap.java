//swapping of two numbers
import java.util.Arrays;
class Swap{
    public static void main(String[] args){
        int a=10;
        int b=40;
        System.out.println(Arrays.toString(swap(a,b)));
    }
    static int[] swap(int first,int second){
        int temp=first;// temp value will be equal to first value and first value will be equal to 0
        first = second;//first value will be equal to second value and second value will be equal to 0
        second =temp;//second value is equal to temp value and temp will be equal to 0
        return new int[]{first,second};
    }
}