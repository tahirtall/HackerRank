import java.util.*;
import java.util.Collection;
import java.util.Arrays;

class JumpingOnTheClouds {
    public static void main(String[] args) {
        int[] c = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 
            1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 
            1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0}; 

        //int[] c = {0, 0, 0, 0, 1, 0};
        
        int counter = 1;
        for (int i=0; i<c.length-3; i++) {
            if (c[i+2] == 0) {
                i = i+1;
                counter++;
                continue;
            }
            else {
                counter++;
            }
        }
        System.out.print(counter);
}
}

