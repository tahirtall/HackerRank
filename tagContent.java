import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class tagContent {
    public static void printHTML(int n) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        int counter = 0;
        List<String> result = new ArrayList<String>();
        while (counter < n) {
            List<String> tags = new ArrayList<String>();
            String str = scanner.nextLine();
            Pattern pattern = Pattern.compile("<[^>]*>");
            Matcher matcher = pattern.matcher(str);
            while(matcher.find()) {
                String strTags = matcher.group();
                tags.add(strTags);
            }
            tags.add("end");
            for (int i=0; i<tags.size(); i=i+2) {
                if(tags.get(i) == "end") {
                    break;
                }
                String compare1 = tags.get(i).substring(1,(tags.get(i).length()-1));
                String compare2 = tags.get(i+1).substring(2,(tags.get(i+1).length()-1));
                if(!compare2.equals(compare1)) {
                    isValid = false;
                    break;
                }
            }
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
            counter++;
        }
        for (int k=0; k<result.size(); k++) {
            System.out.println(result.get(k));
        } 
    }
    public static void main(String[] main) {
        printHTML(2);
    }
}
