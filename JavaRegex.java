/*
   Challenge:
        Write a class called MyRegex which will contain a string pattern.
        You need to write a regular expression and assign it to the pattern 
        such that it can be used to validate an IP address.
        Function will return "true", if given input is a valid IP address, and
        return false otherwise. 

        Use the following definition of an IP address:

            IP address is a string in the form "A.B.C.D", 
            where the value of A, B, C, and D may range from 0 to 255. 
            Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.

            Ex: 121.234.12.12
*/
import java.util.Scanner;


class JavaRegex{

    // Checks if IP adress is in the right format.
        // (An IP address required to have 3 periods dividing 4 sets of numbers. Ex: 121.234.12.12)
        // function below returns true, if input string contains 3 periods. False, otherwise.
    public static String isThree(String s) {
        int counter = 0;
        final char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '.') {
                counter++;
            }
        }
        if (counter == 3) {
            return "true";
        }
        return "false";
    }

    // After making sure, the input string has 3 periods,
    // The function splits the string to an array by the period.
    public static String[] splitString(String s) {
        String[] arr = new String[4];
        if(isThree(s) == "true") {
            arr = s.split("\\.");
        }
        return arr;
    }
    // Checks if the giving IP input is valid.
    // Returns true if it is. False otherwise.
    public static boolean isValidIP(String s) {
        String[] arr = new String[splitString(s).length];
        int[] intArr = new int[splitString(s).length];
        arr = splitString(s);

        if(isThree(s) != "true")    return false;
        if (arr.length > 4)         return false;

        // converts string array into int array.
        try{
            for (int i=0; i<intArr.length; i++){
                intArr[i] = Integer.parseInt(arr[i]);
            }
        }catch (Exception e) {
            return false;
        }
        // Checks conditions for IP address to be valid.
        // Returns true if given IP address is valid.
        // Returns false otherwise. 
        for (int j=0; j<4; j++) {
            if(intArr[j] > 255 && intArr[j] < 0) return false;
            if(Integer.toString(intArr[j]).length() > 3)    return false;
        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.print("Please enter IP: ");
            String s = input.next();
            if(s.equals("quit") || s.equals("QUIT") || s.equals("Quit")) return;
            boolean b = isValidIP(s);
            System.out.println(b);
        }
    }
}
