package palindromeNumber;

public class SolutionPalindrome {
    public boolean isPolindrome(int x){
        if(x >= 0 && x<10){
            return true;
        }
        if(x < 0 || x%10 == 0){
            return false;
        }
        int result = 0;
        while(x > result){
            int ostatok = x%10;
            x/=10;
            result = (result * 10) + ostatok;
        }
        if(result == x || result/10 == x){
            return true;
        }else{
            return false;
        }
    }
}
