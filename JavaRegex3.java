import java.util.regex.Matcher;
import java.util.regex.Pattern;


class JavaRegex3 {

    // Trying to understand behaviour of how grouping works in regex. Steps below will explain what I am trying to do as my next step before I do them.
    // Step 1: match a word in a word.
    // Step 2: match the two duplicate words.
    //  s.2.1 -> when I try it on a regex tester. the pattern seems to work, but it won't return true here.
    // Step 3: find out why it doesn't match here, but does it on a regex tester website.
    
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\b(\\w)+\\s\1\b");
        Matcher m = p.matcher("love love");
        boolean b = m.matches();

        System.out.print(b);
    }
}