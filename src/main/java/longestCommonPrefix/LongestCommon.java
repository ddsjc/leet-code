package longestCommonPrefix;

import java.util.Arrays;

public class LongestCommon {
    public String longestCommonPrefix(String[] strs) {
        String result = new String();
        char[] chars = strs[0].toCharArray();
        if(strs.length == 1){
            result = strs[0];
        }
        for(int i = 1; i < strs.length; i++){
            char[] currentWord = strs[i].toCharArray();
            for (int j = 0; j < chars.length; j++){
                if(j >= currentWord.length){
                    chars = Arrays.copyOf(chars, j);
                    result = String.valueOf(chars);
                    break;
                }
                if(chars[j] != currentWord[j]){
                    chars = Arrays.copyOf(chars, j);
                    result = String.valueOf(chars);
                    break;
                }
                result = String.valueOf(chars);
            }
        }
        return  result;
    }
}
