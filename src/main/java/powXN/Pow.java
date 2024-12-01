package powXN;

public class Pow {
    public double myPow(double x, int n) {
        int result = 1;
        boolean flag = false;
        if(n == 0){
            return x;
        }
        if(n < 0){
            flag = true;
            n *= -1;
        }
        while(n != 0){
            result *= x;
            n--;
        }
        if(flag){
            result = 1 / result;
        }
        return result;
    }
}
