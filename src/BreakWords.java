import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
public class BreakWords {
    public static void main(String[] args) throws IOException {
        // Enter data using BufferReader
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        String line = reader.readLine();

        // Split the input into an array of words
        String words[] = line.split("\\s");

        // Loop over every word, then loop over every character in that word.
        // If the character is a letter or apostrophe, do nothing.
        // If the character is not a letter, remove the character from the string.
        // Print the word when the sifting is done.
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (Character.isLetter(words[i].charAt(j))) ;
                else if (Objects.equals(words[i].charAt(j),'\'')) ;
                else {
                    words[i] = words[i].substring(0, j) + words[i].substring(j + 1);
                    j--;
                }
            }
            System.out.println(words[i]);
        }
    }
}
