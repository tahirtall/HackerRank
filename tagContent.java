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
        List<String> posArr = new ArrayList<String>();
        String str = scanner.nextLine();
        String[] result = str.split("\\<.*?\\>");
        posArr = Arrays.asList(result);
        System.out.print(posArr + "\n");
    } 
    public static void main(String[] main) {
        printHTML();
    }
}
