import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


class JavaRegex3 {

    // Trying to understand behaviour of how grouping works in regex. Steps below will explain what I am trying to do as my next step before I do them.
    // Step 1: match a word in a word.
    // Step 2: match the two duplicate words.
    //  s.2.1 -> when I try it on a regex tester. the pattern seems to work, but it won't return true here.
    // Step 3: find out why it doesn't match here, but does it on a regex tester website.
    //  s.3.1 -> apperantly, I had to double slash everything.
    // Step 4: now match, duplicate words in a sentence.
    // Step 5: remove the matched words from the belonging sentence.
    // Step 6: Now print the items with one of the matched words completed.
    
    public static void main(String[] args) {
        String regex = "\\b(\\w+)(?:\\s+\\1\\b)+";
        String testGroup = "Goodbye bye bye world world world\n"
                    + "Sam went went to to to his business\n"
                    + "Reya is is the the best player in eye eye game\n"
                    + "in inthe\n"
                    + "Hello hello Ab \n"
                    + "love love love\n"
                    + "I love Love to To tO code\n";
        Pattern p = Pattern.compile(regex, Pattern.CANON_EQ | Pattern.MULTILINE | Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(testGroup);
        while(m.find()) {
            testGroup = testGroup.replaceAll(m.group(), m.group(1));
        }
        System.out.println(testGroup);
    }
}