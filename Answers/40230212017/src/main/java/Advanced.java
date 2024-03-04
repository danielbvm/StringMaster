import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content
     * 
     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input
     * and change it with the newWord
     * 
     */
    public String wordCensor(String sentence, String word, String newWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                words[i] = newWord;
            }
        }
        String answer = "";
        for (int i = 0; i < words.length; i++) {
            answer += " " + words[i]; 
        }
        answer=answer.trim();

        return answer;

    }

    /**
     * In this function You have a firstName and a lastName as Entry and you have to
     * normalize them as a fullName
     * 
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName  is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of
     *         firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName) {
        String firstName2 = firstName.toLowerCase();
        firstName2 = firstName2.substring(0,1).toUpperCase() + firstName2.substring(1);
        String lastName2 = lastName.toLowerCase();
        lastName2 = lastName2.substring(0,1).toUpperCase() + lastName2.substring(1);
        if(lastName == " "){
            return firstName2;
        }
        else{
            return firstName2 + " " + lastName2;
        }
        
    }

    /**
     * Removing repeated letter in a word
     * 
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated
     *         letters should be omitted
     */
    public String doubleChar(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
    
        StringBuilder sb = new StringBuilder();
        char[] charArray = word.toCharArray();
        sb.append(charArray[0]); // Append the first character since it's never a duplicate
    
        for (int i = 1; i < word.length(); i++) {
            // Check if the current character is different from the previous one
            if (charArray[i] != charArray[i - 1]) {
                sb.append(charArray[i]); // Append the character if it's not a duplicate
            }
        }
    
        return sb.toString();
    }
}
