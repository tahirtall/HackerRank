import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class HeadsOrTails {
    public static List<Integer> getMaxStreaks(List<String> toss) {
        List<String> toss2 = new ArrayList<String>();
        toss2 = toss;
        toss2.add("End");        
        List<Integer> streakCount = new ArrayList<Integer>();
        
        int counterH = 0;
        int longestH = 0;
        int i = 0;
        while(toss2.get(i) != "End") {
            if(toss2.get(i) == "Heads") {
                counterH++;
            }
            if(toss2.get(i+1) == "Tails" || toss2.get(i+1) == "End") {
                if (counterH > longestH) {
                    longestH = counterH;
                }
                counterH = 0;
            }
            i++;
        }

        int counterT = 0;
        int longestT = 0;
        int j = 0;
        while(toss2.get(j) != "End") {
            if(toss2.get(j) == "Tails") {
                counterT++;
            }
            if(toss2.get(j+1) == "Heads" || toss2.get(j+1) == "End") {
                if (counterT > longestT) {
                    longestT = counterT;
                }
                counterT = 0;
            }
            j++;
        }

        streakCount.add(longestH);
        streakCount.add(longestT);
        return streakCount;
    }
    public static void main(String[] args) {
        // Creating the same test cases from the HackerRank website.
        List<String> toss = new ArrayList<String>();
        toss.add("Heads");
        toss.add("Tails");
        toss.add("Tails");
        toss.add("Tails");
        toss.add("Heads");
        toss.add("Heads");
        toss.add("Tails");
        System.out.println("-----------------------------");
        System.out.println("Output   -> " + getMaxStreaks(toss));
        System.out.println("Expected -> [2, 3]");
        System.out.println("-----------------------------");

        List<String> toss2 = new ArrayList<String>();
        toss2.add("Tails");
        toss2.add("Tails");
        toss2.add("Tails");
        System.out.println("Output   -> " + getMaxStreaks(toss2));
        System.out.println("Expected -> [0, 3]");
        System.out.println("-----------------------------");

        List<String> toss3 = new ArrayList<String>();
        toss3.add("Heads");
        toss3.add("Heads");
        toss3.add("Heads");
        toss3.add("Heads");
        System.out.println("Output   -> " + getMaxStreaks(toss3));
        System.out.println("Expected -> [4, 0]");
        System.out.println("-----------------------------");
    }
}