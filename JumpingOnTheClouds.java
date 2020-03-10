import java.util.*;
import java.util.Collection;
import java.util.Arrays;

class JumpingOnTheClouds {
    public static void main(String[] args) {
        int[] c = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 
            1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 
            1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0};

        int[] d = {0, 0, 1, 0, 0, 1, 0};

        int i=0;
        int counter = 0;
        while(i != d.length-1) {
            if (d[i+2] != 0) {
                i = i + 1;
            }
            else {
                i = i + 2;
            }
            counter++;
        }
        System.out.print(counter);
}
}

