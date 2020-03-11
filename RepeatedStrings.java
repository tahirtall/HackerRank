class RepeatedStrings {

    public static void repeatedStrings(String s, long n) {
        long result = 0;
        long counter2 = 0;
        long counter = 0;
        long temp = n % (long)s.length();
        long full = n / (long)s.length();

        System.out.print("temp: " + temp + "\n");
        System.out.print("full: " + full + "\n");

        if ( temp > 0) 
        {
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
            result = result + counter;
        }
        if (temp == 0) 
        {
            for (int j=0; j<s.length(); j++) {
                if(s.charAt(j) == 'a') {
                    counter2++;
                }
            }
            result = counter2 * n;5
            result = result / s.length();    
        }
        System.out.println("result: " + result);
    }

    public static void main(final String[] args) {
        repeatedStrings("a", 1000000000000L);
    }
}