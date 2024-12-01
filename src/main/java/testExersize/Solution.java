package testExersize;

public class Solution {
    public static void main(String[] args) {
        for(int i = 0; i <= 1000; i ++){
            if(i % 3 == 0 && i % 5 != 0){
                if(sumOfDigits(i) < 10){
                    System.out.println(i);
                }
            }
        }
    }
    private static int sumOfDigits(int number){
        int sum = 0;
        while (number > 0){
            sum += number%10;
            number /= 10;
        }
        return sum;
    }
}
