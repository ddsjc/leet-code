package romanToInteger13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        char[] string = s.toCharArray();
        Map<Character, Integer> table = new HashMap<>();
        int result = 0;
        table.put('I', 1);
        table.put('V', 5);
        table.put('X', 10);
        table.put('L', 50);
        table.put('C', 100);
        table.put('D', 500);
        table.put('M', 1000);
        for(int i = 0; i < string.length - 1; i++){
            if(table.get(string[i+1]) <= table.get(string[i])){
                result += table.get(string[i]);
            }
            else{
                result -= table.get(string[i]);
            }
        }
        return result + table.get(string[s.length()-1]);
    }
}
