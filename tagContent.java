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

            for (int i=0; i<tags.size(); i++) {
                if (tags.get(i+1) == "end") {
                    break;
                }
                boolean slash = tags.get(i).contains("/");
                if(slash == false) {
                    for (int ii=i+1; ii<tags.size(); ii++) {
                        boolean slash2 = tags.get(ii).contains("/");
                        if (slash2 == true) {
                            String compare1 = tags.get(i).substring(1,(tags.get(i).length()-1));
                            String compare2 = tags.get(ii).substring(2,(tags.get(ii).length()-1));
                            if (compare1.equals(compare2)) {
                                tags.remove(i);
                                tags.remove(ii);
                            }
                        }
                    }
                }
            }
            if (tags.size() > 1) {
                isValid = false;
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
            testCases--;
        }
        for (int k=0; k<result.size(); k++) {
            System.out.println(result.get(k));
        } 
    }
    public static void main(String[] main) {
        //printHTML();
        String aa = "</h1>";
        String bb = aa.substring(1, (aa.length()-1));
        System.out.print(aa.contains(bb));
    }
}
