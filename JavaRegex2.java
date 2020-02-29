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
    
    My thought process:

        In an IP address, there has to be 4 groups (A.B.C.D):
            Possible digit formats in a single group are: 0, 00, 000.
            Three digit number cannot be larger than 255.
            Single digit and two digit numbers should be 0-9 and 0-99.
        So, regex implementetion would be:
            ([0-9]|0[0-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])  -> Regex for 3 digit.
            ([0-9][0-9])                                         -> Regex for 2 digit.
            ([0-9])                                              -> Regex for 1 digit.
        Now, I combine them all:
            (25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)               -> This would be for 1 group.
        Since there are 4 groups:
            (25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)

        https://www.regextester.com/?fam=114925                  -> Created a test envirement at regextester.com. The regex implementation seems to work, but I can't get it compile on the Java IDE.

    TODO:
        " " is suppose to define existing of a period, however, java IDE's throws error.
        Find a way to implement above regex to work with below code.
    */
    
import java.util.Scanner;

    class JavaRegex2{
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                String IP = in.next();
                System.out.println(IP.matches(new MyRegex().pattern));
            }
    
        }
    }

    class MyRegex{
    	final String pattern = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
    }