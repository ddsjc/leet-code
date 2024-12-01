package lemonadeChange;

public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int countOfFive = 0, countOfTen = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                countOfFive +=1;
            }
            else if(bills[i] == 10 && countOfFive > 0){
                countOfTen +=1;
                countOfFive -=1;
            }
            else if(bills[i] == 20 && (countOfTen >= 1 && countOfFive >=1) || (countOfFive >= 3) ){
                if(countOfTen > 0){
                    countOfTen -=1;
                    countOfFive -=1;
                }else{
                    countOfFive -=3;
                }
            }
            else {
                return false;
            }
        }
        if(countOfFive >= 0 && countOfTen >= 0){
            return true;
        }
        return false;
    }
}
