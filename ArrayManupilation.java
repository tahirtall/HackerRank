import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class ArrayManupilation {
    // n - number of elements in the array
    // queries - a two dimensional array of queries where each queries[i] contains three integers, a, b, and k.    
    public static long arrayManupilation(int n, int[][] queries) {
        // initiated a new 2D array with dimentions from queries[0]
        int[][] myArr = new int[queries.length][n];

        // filled the subarrays with 0s
        for (int i=0; i<queries.length; i++) {
            Arrays.fill(myArr[i], myArr[i][0], myArr[i][n-1], 0);
        }
        // now fill them up with the ints from queries
        for (int j=0; j<queries.length; j++) {
            Arrays.fill(myArr[j], queries[j][0], queries[j][1], queries[j][2]);
        }
        
        // result will be the container that will hold sum of subarrays inside the for loop
        int[] result = new int[queries.length];
        // one final loop to add all subarrays with eachother
        for (int k=1; k<myArr.length; k++) {
            for (int x=0; x<result.length; x++) {
                result[x] = result[x] + myArr[k][x];
            }
        }
        // sort result array and return it.
        return result[result.length-1];
    }
    public static void main(String[] args) {
        // input queries
        int[][] arr2D = {
            {1, 5, 3},
            {4, 8, 7},
            {6, 9, 1},   
        };
        // input n
        int num = 10;
        // function call
        System.out.print(arrayManupilation(num, arr2D) + "\n");

    }
}
