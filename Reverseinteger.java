//reversing the number
class Reverseinteger{
    public static void main(String[] args){
        int num=43766382;
        System.out.println(reverse(num));
    }
    static int reverse(int a){
        int sum=0;
        while(a>0){
            int rem=a%10;  //gives the last digit of the number
            sum=sum*10+rem; //the last digit will be stored in the sum and loop will be continued through the whole number
            a=a/10; //the last digit is already assigned to the sum so we can elimnate last digit so we divide number with 10
        }
        return sum;
    }
}