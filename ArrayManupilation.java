import java.util.Arrays;
class ArrayManupilation {
    // n - number of elements in the array
    // queries - a two dimensional array of queries where each queries[i] contains three integers, a, b, and k.    
    public static int arrayManupilation(int n, int[][] queries) {
        // initiated a new 2D array with dimentions from queries[0]
        int[][] myArr = new int[queries[0][1]][queries[0][0]];
        // filled the subarrays with 0s
        for (int i=0; i<queries[0][1]; i++) {
            Arrays.fill(myArr[i], 0, queries[0][0], 0);
        }
        // now fill them up with the ints from queries
        for (int j=0; j<queries[0][1]; j++) {
            Arrays.fill(myArr[j], queries[j+1][0], queries[j+1][1], queries[j+1][2]);
        }
        System.out.print(myArr[0][4]);
        return 1;
    }
    public static void main(String[] args) {
        // input queries
        int[][] arr2D = {
            {10, 3},
            {1, 5, 3},
            {4, 8, 7},
            {4, 9, 1}   
        };
        // input n
        int num = 10;
        // function call
        System.out.print(arrayManupilation(num, arr2D));

    }
}