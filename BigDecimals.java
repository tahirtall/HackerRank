import java.math.BigDecimal;
import java.util.*;

public class BigDecimals {

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        for(int j=0; j<s.length; j++) {
            if (s[j+1] == null) {
                break;
            }
            for (int jj=j; j<s.length; jj++) {
                if (s[jj] == null) {
                    break;
                }
                BigDecimal currJ = new BigDecimal(s[j]);
                BigDecimal currJJ = new BigDecimal(s[jj]);
                if (currJJ.compareTo(currJ) > 0) {
                    s[j] = currJJ.toString();
                    s[jj] = currJ.toString();
                }
            }
        }
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}