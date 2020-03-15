import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

class TheFundRaisingProblem {
    // Initiating a scanner for the user input.  
    private static final Scanner scanner = new Scanner(System.in);
    // Gets the input from the user to set up student array and guest array for each test case;
    static void getInput() {
        int caseNum = scanner.nextInt();
        for (int k = 0; k<caseNum; k++) {
            // number of students groups
            int m = scanner.nextInt();
            // number of students in each group.
            int n = scanner.nextInt();
            // number of tables for the guests.
            int guestTable = scanner.nextInt();
            // setting up the groups and charms for the students.
            int[][] studentArr = new int[m][n];
            for (int i=0; i<m; i++) {
                for (int j=0; j<n; j++) {
                    studentArr[i][j] = scanner.nextInt();
                }
            }
            // setting up the guest tables
            int[][] guestArr = new int[guestTable][];
            for (int g=0; g<guestTable; g++) {
                int guestNum = scanner.nextInt();
                guestArr[g] = new int[guestNum];
                for (int gg=0; gg<guestNum; gg++){
                    guestArr[g][gg] = scanner.nextInt();
                }
            }
            // maximum number of guests a student can approach
            int max = scanner.nextInt();
        }
    }

    static void solve() {
        getInput();
        System.out.print(max);
    }

    public static void main (String[] main) {
       /*  Integer[][] test1 = {
            {1},                                // test[0][0] -> Number of test cases
            {3, 3, 3},                          // test1[1][0] -> number of groups, test1[1][1] -> number of students in each group, test1[1][0] -> total number of tables for the guests.
            {1, 2, 3},                          //  ** 
            {4, 5, 6},                          //   *-> test[i][j] -> CHARM value of index j student at test[i][j].
            {7, 8, 9},                          //  ** 
            {3, 10, 20, 30},                    //  ** 
            {3, 40, 50, 60},                    //   *-> test[i][0] -> number of guests at that table, rest of the indexes represents GENOROCITY value of the guest.
            {3, 70, 80, 90},                    //  **
            {3}                                 // maximum number of guests a student can reach out to.
        }; */
        solve();
    }
}