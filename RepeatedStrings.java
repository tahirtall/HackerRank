class RepeatedStrings {

    public static long repeatedStrings(final String s, final long n) {
        return 1;
    }
    public static void main(final String[] args) {
        String[] gg = new String[1];
        String[] ggg = new String[10];
        gg[0] = "aba";
        ggg[0] = "aba";

        while(ggg[0].length() <= 10) {
            ggg[0] = ggg[0] + gg[0];
        }

        char[] charArr = ggg[0].toCharArray();

        int counter = -1;
        for (int j=0; j<charArr.length; j++) {
            if(charArr[j] == 'a') {
                counter++;
            }
        }
        System.out.print(counter);


        // abaabaabaabaabaabaabaabaabaaba
    }
}