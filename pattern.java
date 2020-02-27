import java.util.regex.*;

class pattern {
    public static void main (String[] args) {
        String s = "([A-Z])(.+)";
        String s2 = "[AZ[a-z](a-z)";
        String s3 = "batcatpat(nat";
        try {
            Pattern p = Pattern.compile(s3);
        }catch (Exception e) {
            System.out.println("Invalid");
            return;
        }
        System.out.println("Valid");
    }
}