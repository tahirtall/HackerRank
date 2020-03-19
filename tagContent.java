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
        int n = scanner.nextInt();
        ArrayList<Integer> outputArr = new ArrayList<Integer>();
        List<String> posArr = new ArrayList<String>();
        for (int i=0; i<n; i++) {
            String str = scanner.nextLine();
            Pattern pattern = Pattern.compile("<[^>]*>");
            Matcher m = pattern.matcher(str);
            boolean b = m.matches();
            if (b == true) {
                String[] splitArr = str.split("<[^>]*>");
                posArr = Arrays.asList(splitArr);
            }
            if (b == false) {
                posArr.add("invalid");
            }
        }
        for (int ii=0; ii<posArr.size(); ii++) {
            if (posArr.get(ii).length() > 1) {
                System.out.println(posArr.get(ii));
            }
        }
    } 
    public static void main(String[] main) {
        printHTML();
    }
}
