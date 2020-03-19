import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tagContent {

     public static void printHTML() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean matched = false;

        List<String> posArr = new ArrayList<String>();
        List<String> tags = new ArrayList<String>();
        Pattern pattern = Pattern.compile("<[^>]*>");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()) {
            String strTags = matcher.group();
            tags.add(strTags);
        }
        tags.add("end");
        for (int i=0; i<tags.size(); i=i+2) {
           if(tags.get(i+2) == "end")   break;
           if (tags.get(i).equals(tags.get(i+1)))    matched = true;
           else                                 matched = false;
        }

        System.out.print(matched);


        /* String[] result = str.split("\\<.*?\\>");
        posArr = Arrays.asList(result);
        System.out.print(posArr + "\n"); */
    } 
    public static void main(String[] main) {
        printHTML();
    }
}
