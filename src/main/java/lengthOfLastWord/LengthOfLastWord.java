package lengthOfLastWord;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        char[] lastWord = words[words.length - 1].toCharArray();

        return lastWord.length;
    }
}
