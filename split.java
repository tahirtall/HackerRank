import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.io.*;

public class split {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine(); 

        String ss = s.replaceAll("\\,", " ").replaceAll("\\'", " ").replaceAll("\\?"," ").replaceAll("\\@", " ").replaceAll("\\_", " ").replaceAll("\\!", " ").replaceAll("\\.", " ");
        String[] arr = ss.split("\\s+");

        List<String> linkList = new LinkedList<String>(Arrays.asList(arr));
        System.out.println(linkList);
        

        if(linkList.contains("")) {
                linkList.remove(0);
        }

        String[] result = linkList.toArray(new String[linkList.size()]); 

        System.out.println(result.length);
        for (int i=0; i<result.length; i++) {
            System.out.println(result[i]);
        }

        scanner.close();
    }
}

