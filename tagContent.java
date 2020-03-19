import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tagContent {

    public static String printHTML(String str) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Pattern pattern = Pattern.compile("<[^>]*>");
        Matcher m = pattern.matcher(str);
        
        while(m.find()) {
            
        }
        return "1";
    }
    public static void main(String[] main) {
        
    }
}
