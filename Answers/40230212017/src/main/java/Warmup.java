public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {

    String[] words = sentence.split(" ");
    if (number >= 1 && number <= words.length) {
      
        return words[number - 1];
    } else {
        String answer = " Number = " + number + " is out Of Bound";
        return answer;
    }
}
    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {
        int odd = 0;
        int even = 0;
        char[] chars = number.toCharArray();
            for(char c : chars){
                switch(c){
                    case '1': case '3': case '5': case '7': case '9':
                    odd++;
                    break;
                    case '2': case '4': case '6': case '8': case '0':
                    even++;
                    break;
                }
            }
            if(searchForEven == true)
            return even;
            else
            return odd;
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {
        return null;
    }
}
