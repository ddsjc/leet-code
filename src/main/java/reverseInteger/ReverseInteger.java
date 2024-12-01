package reverseInteger;


public class ReverseInteger {
    public int reverse(int x) {
        int reverseNumber = 0;
        boolean flag = true;
        if(x < 0){
            flag = false;
            x *= -1;
        }
        while (x > 0){
            if(reverseNumber < Integer.MIN_VALUE /10 || reverseNumber > Integer.MAX_VALUE/10){
                return 0;
            }
            reverseNumber = reverseNumber*10 + x%10;
            x /= 10;
        }
        if(!flag){
            return  reverseNumber * -1;
        }
        else{
            return reverseNumber;
        }
    }
}
