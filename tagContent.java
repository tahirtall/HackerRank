import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class tagContent {
    static void printHTML() {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        boolean isValid = true;
        List<String> result = new ArrayList<String>();
        while (testCases > 0) {
            List<String> tags = new ArrayList<String>();
            String str = scanner.nextLine();
            Pattern pattern = Pattern.compile("<[^>]*>");
            Matcher matcher = pattern.matcher(str);
            while(matcher.find()) {
                String strTags = matcher.group();
                tags.add(strTags);
            }
            tags.add("end");
            // TODO: I need to iterate through tags array, and compare it's elemets with each other, and be able to check validity of the html tags. If there is a invalid tag,
            // set isValid to False. If all tags are valid, set isValid to true. 

            List<String> posArr = new ArrayList<String>();
            if (isValid == false) {
                result.add("none");
            }
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
        for (int k=0; k<result.size(); k++) {
            System.out.println(result.get(k));
        } 
    }
    public static void main(String[] main) {
        printHTML();
    }
}
