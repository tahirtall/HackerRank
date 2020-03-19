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
            List<String> tags = new ArrayList<String>();
            //stores the current input string
            String str = scanner.nextLine();
            // compiling the regex
            Pattern pattern = Pattern.compile("<[^>]*>");
            // matching the pattern with input string
            Matcher matcher = pattern.matcher(str);
            // adds all of the found html tags to tags array
            while(matcher.find()) {
                String strTags = matcher.group();
                tags.add(strTags);
            }
            // add string "end" to the end of the tags array
            tags.add("end");

            // TODO: I need to iterate through tags array, and compare it's elemets with each other, and be able to check validity of the html tags. If there is a invalid tag,
            // set isValid to False. If all tags are valid, set isValid to true. 

            List<String> posArr = new ArrayList<String>();
            // if isValid is false, add "none" to result array and moves on to the next input.
            if (isValid == false) {
                result.add("none");
            }
            // if isValid is true, continues on with splitting html tags from the inbetween text, and add that text to the results array
            else {
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
