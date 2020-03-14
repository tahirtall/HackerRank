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

class HighSecurityString {
    
    public static int[][] charToNum(int weight_a) {
        int[][] alphabet = new int[26][2];
        int charr = 97;
        int counter = weight_a;
        for (int i=0; i<26; i++) {
            alphabet[i][0] = charr;
            alphabet[i][1] = counter;
            charr++;
            counter++;
            if (counter == 26) {
                counter = 0;
            }
        }
        return alphabet;
    }

    public static int getStrength(String password, int weight_a) {
        int count = 0;
        int[][] newArr = charToNum(weight_a);
        for (int i=0; i<password.length(); i++) {
            for (int j=0; j<26; j++) {
                int ascii = (int) password.charAt(i);
                if (ascii == newArr[j][0]) {
                    count = count + newArr[j][1];
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print(getStrength("hackerrank", 10));
    }

}