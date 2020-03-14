class TheFundRaisingProblem {

    static void guestTable(int[] generosities) {

    }

    static void solve() {


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
    }
}