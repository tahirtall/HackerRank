class CountingValleys {

    public static void countingValleys(int n, String s) {
        int result = 0;
        int seaLevel = 0;

        int i=0;
        while(i < n) {
            if (s.charAt(i) == 'U') {
                seaLevel = seaLevel + 1;
            }
            if (s.charAt(i) == 'D') {
                seaLevel = seaLevel - 1;
            }
            if (seaLevel == -1 && s.charAt(i+1) == 'U') {
                result++;
            }
            i++;
        }
        System.out.print(result);
    }
    public static void main(String[] args) {
        countingValleys(8, "UDDDUDUU");
    }
}