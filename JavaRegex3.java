import java.util.regex.Matcher;
import java.util.regex.Pattern;


class JavaRegex3 {

    // Trying to understand behaviour of how grouping works in regex. Steps below will explain what I am trying to do as my next step before I do them.
    // Step 1: match a word in a word.
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[A-Za-z]+");
        Matcher m = p.matcher("love");
        boolean b = m.matches();

        System.out.print(b);
    }
}