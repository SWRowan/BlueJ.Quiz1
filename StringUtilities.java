
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String reverse = "";
        for (int j =valueToBeReversed.length() -1; j >= 0 ; j--){
            reverse = reverse + valueToBeReversed.charAt(j);
        }
        return reverse;

    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        if(word.length() % 2 == 0){
            char c = word.charAt(word.length()/2 -1);
            return c;
        } else {
            char c = word.charAt(word.length()/2);
            return c;
        }
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String str = "";
        for(int i = 0; i <= value.length()-1; i++){
            if(value.charAt(i) != charToRemove){
            str += value.charAt(i);
            }
        }
        return str;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] str = sentence.split(" ");
        String lastWord = str[str.length-1];
        return lastWord;
    }
}
