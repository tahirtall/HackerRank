import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.Collection;

class TheFundRaisingProblem {
    // Initiating a scanner for the user input.  
    private static final Scanner scanner = new Scanner(System.in);
    // Gets the input from the user to set up student array and guest array for each test case;
    static void solve() {
        int caseNum = scanner.nextInt();
        ArrayList<Integer> resultArr = new ArrayList<Integer>();
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

            ArrayList<Integer> newStudentArr = new ArrayList<Integer>();
            ArrayList<Integer> newGuestArr = new ArrayList<Integer>();

            // Added all elements of studentArr into newStudentArr
            for (int ii=0; ii<studentArr.length; ii++) {
                for (int jj=0; jj<studentArr[ii].length; jj++) {
                    newStudentArr.add(studentArr[ii][jj]);
                }
            }
            // Added all elements of guestArr into newGuestArr
            for (int kk=0; kk<guestArr.length; kk++) {
                for (int xx=0; xx<guestArr[kk].length; xx++) {
                    newGuestArr.add(guestArr[kk][xx]);
                } 
            }
            // Reverse Sort newStudentArr and newGuestArr
            Collections.sort(newStudentArr, Collections.reverseOrder());
            Collections.sort(newGuestArr, Collections.reverseOrder());
            // Duplicate each element in newStudentArr by number of max.
            ArrayList<Integer> newStudentArr2 = new ArrayList<Integer>(newStudentArr.size() * max);
            for (int cc=1; cc<=max; cc++) {
                newStudentArr2.addAll(newStudentArr);
            }
            Collections.sort(newStudentArr2, Collections.reverseOrder());
            // Multiple each elements in the arrays and append them to an int variable
            int result = 0;
            for (int vv=0; vv<newGuestArr.size(); vv++) {
                result = result + (newGuestArr.get(vv) * newStudentArr2.get(vv));
            }
            resultArr.add(result);
        }
        for (int bb=0; bb<resultArr.size(); bb++) {
              System.out.println(resultArr.get(bb));
        }
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