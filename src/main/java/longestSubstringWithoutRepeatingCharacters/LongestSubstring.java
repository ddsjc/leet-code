package longestSubstringWithoutRepeatingCharacters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder resultStringBuilder = new StringBuilder();
        resultStringBuilder.setLength(0);
        StringBuilder currentStringBuilder = new StringBuilder();
        Map<Character, Integer> symbols = new HashMap<>();
        if(s.length() == 1){
            return 1;
        }

        for (int i = 0; i < s.length(); i++){
            if (!symbols.containsKey(s.charAt(i))) {
                currentStringBuilder.append(s.charAt(i));
                symbols.put(s.charAt(i), i);
            } else {
                if (currentStringBuilder.length() > resultStringBuilder.length()) {
                    resultStringBuilder = new StringBuilder(currentStringBuilder);
                }
                //i = symbols.get(s.charAt(i));
                currentStringBuilder.setLength(0);
                symbols.clear();
            }
        }

        if (currentStringBuilder.length() > resultStringBuilder.length()) {
            resultStringBuilder = new StringBuilder(currentStringBuilder);
        }

        return resultStringBuilder.length();
    }
}
