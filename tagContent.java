import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tagContent {
    public static void printHTML() {
        Scanner scanner = new Scanner(System.in);
        // number of input lines.
        int testCases = Integer.parseInt(scanner.nextLine());
        List<String> result = new ArrayList<String>();
        // Finds all the html tags in given string input. Checks for validity, and add the proper corresponding string to the result arr.
        while (testCases > 0) {
            boolean isValid = true;
            List<String> tagsStart = new ArrayList<String>();
            List<String> tagsEnd = new ArrayList<String>();
            // stores the current input string
            String str = scanner.nextLine();
            // compiling the regex and matching
            Pattern tagStart = Pattern.compile("<[A-Za-z1-9\\s]*>");
            Pattern tagEnd = Pattern.compile("<\\/[A-Za-z1-9\\s]*>");
            Matcher matcherStart = tagStart.matcher(str);
            Matcher matcherEnd = tagEnd.matcher(str);

            // finds all matches for tagStart pattern and adds them to tagsStart array
            while(matcherStart.find()) {
                String strTags = matcherStart.group();
                tagsStart.add(strTags);
            }
            // finds all matches for tagEnd pattern and adds them to tagsEnd array
            while(matcherEnd.find()) {
                String strTags2 = matcherEnd.group();
                tagsEnd.add(strTags2);
            }
            List<String> posArr = new ArrayList<String>();
            if (tagsStart.size() == tagsEnd.size()) {
                for (int ii=0; ii<tagsStart.size(); ii++) {
                    if (!tagsStart.get(ii).substring(1).equals(tagsEnd.get(ii).substring(2))) {
                        isValid = false;
                        result.add("none");
                    }
                }
            }

            if (isValid != false) {
                ArrayList<String> temp2 = new ArrayList<String>();
                String[] splitRegex = str.split("<[^>]*>");
                for (int j=0; j<splitRegex.length; j++) {
                    if (splitRegex[j].length() > 0) {
                        List<String> temp3 = Arrays.asList(splitRegex[j]);
                        result.add(temp3.get(0));
                    }
                }
            }
            testCases--;
        } 
        // iterates through the results array and prints the kth element, line at a time.
        for (int k=0; k<result.size(); k++) {
            System.out.println(result.get(k));
        }
    }
    public static void main(String[] main) {
        printHTML();
    }
}
