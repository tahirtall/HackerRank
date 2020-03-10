class RepeatedStrings {

    public static long repeatedStrings(final String s, final long n) {
        int result = 0;
        int counter2 = 0;
        int counter = 0;
        int temp = (int)n%(int)s.length();
        int full = (int)n / (int)s.length();

        if(s.length() == 1) {
            return n;
        }
        if ( temp > 0) {
        
            // Full
            for (int j=0; j<s.length(); j++) {
                if(s.charAt(j) == 'a') {
                    counter2++;
                }
            }
            result = counter2 * full;
            // Remainder
            for (int i=0; i<temp; i++) {
                if(s.charAt(i) == 'a') {
                    counter++;
                }
            }
            return result + counter;
        }
        if (temp == 0) {
            for (int j=0; j<s.length(); j++) {
                if(s.charAt(j) == 'a') {
                    counter2++;
                }
            }
            result = counter2 * (int)n;
            result = result / s.length();
            return result;       
        }
        return 0;
    }
    public static long main(final String[] args) {
        long n = (long)49382313570;
        repeatedStrings("epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq", n);
    }
}