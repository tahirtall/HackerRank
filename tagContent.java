import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tagContent {

    public static final Scanner scanner = new Scanner(System.in);
    public static void printHTML(int n) {
        boolean matched = true;
        String strTags;
        List<String> result = new ArrayList<String>();
        List<String> posArr = new ArrayList<String>();
        List<String> tags = new ArrayList<String>();
        int counter = 0;
        while (counter != n) {
            String str = scanner.nextLine();
            Pattern pattern = Pattern.compile("<[^>]*>");
            Matcher matcher = pattern.matcher(str);
            while(matcher.find()) {
                strTags = matcher.group();
                tags.add(strTags);
            }
            tags.add("end");
            for (int i=0; i<tags.size(); i=i+2) {
                if(tags.get(i) == "end"){
                    break;
                }
                if (!tags.get(i+1).contains("/") || tags.get(i).contains("/")) {
                    matched = false;
                    break;
                }
                if (!tags.get(i).substring(1,(tags.get(i).length()-2)).equals(tags.get(i+1).substring(2, (tags.get(i+1).length()-2)))){
                    matched = false;
                    break;
                }
            }

            if (matched == false) {
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
            System.out.print(result.get(k));
        }
    }
    public static void main(String[] main) {
        
    }
}
