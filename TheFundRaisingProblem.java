import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

class TheFundRaisingProblem {

    static void setUp() {
        
    }

    static void guestTable(int[] generosities) {

    }

    static void solve() {
        List<List<List<Integer>>> crazyArr = new ArrayList<List<List<Integer>>>(1);
        

    }
    public static void main (String[] main) {
        Integer[][] test1 = {
            {1},                                // test[0][0] -> Number of test cases
            {3, 3, 3},                          // test1[1][0] -> number of groups, test1[1][1] -> number of students in each group, test1[1][0] -> total number of tables for the guests.
            {1, 2, 3},                          //  ** 
            {4, 5, 6},                          //   *-> test[i][j] -> CHARM value of index j student at test[i][j].
            {7, 8, 9},                          //  ** 
            {3, 10, 20, 30},                    //  ** 
            {3, 40, 50, 60},                    //   *-> test[i][0] -> number of guests at that table, rest of the indexes represents GENOROCITY value of the guest.
            {3, 70, 80, 90},                    //  **
            {3}                                 // maximum number of guests a student can reach out to.
        };

        String[] mn = {"3","3"};
        int m = Integer.parseInt(mn[0].trim());
        int n = Integer.parseInt(mn[1].trim());

        int[][] charm = new int[m][n];


    }
}