import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class tagContent {
    static void printHTML() {
        Scanner scanner = new Scanner(System.in);
        // number of input lines.
        int testCases = Integer.parseInt(scanner.nextLine());
        boolean isValid = true;
        List<String> result = new ArrayList<String>();
        // Finds all the html tags in given string input. Checks for validity, and add the proper corresponding string to the result arr.
        while (testCases > 0) {
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
            if (tagsStart.size() != tagsEnd.size()) {
                result.add("none");
            }
            if (tagsStart.size() == tagsEnd.size()) {
                for (int ii=0; ii<tagsStart.size(); ii++) {
                    if (!tagsStart.get(ii).substring(1, tagsStart.get(ii).length() - 1).equals(tagsEnd.get(ii).substring(2, tagsStart.get(ii).length() - 1))) {
                        result.add("none");
                        break;
                    }
                }
            }else {
                String[] splitRegex = str.split("<[^>]*>");
                posArr = Arrays.asList(splitRegex);
                for (int j=0; j<posArr.size(); j++) {
                    posArr.get(j).trim();
                    if (posArr.get(j).length() > 1) {
                        result.add(posArr.get(j));
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
