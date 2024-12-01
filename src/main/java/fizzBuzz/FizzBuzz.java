package fizzBuzz;

public class FizzBuzz {
    public byte[] fizzBuzz(int target) throws IllegalAccessException {
        String stroka = new String();
        byte[] result;
        if(target % 3 == 0 && target != 0 ){
            stroka += "Fizz";
        }
        if(target % 5 == 0 && target != 0){
            stroka += "Buzz";
        }
        if(target % 5 != 0 && target % 3 != 0 ){
            throw new IllegalAccessException();
        }
        result = stroka.getBytes();
        return result;
    }
}
