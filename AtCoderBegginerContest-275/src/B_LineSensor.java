
package src;
import java.math.BigInteger;
import java.util.*;

public class B_LineSensor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int divisor = 998244353;

        long input[] = new long[6];
        for (int i = 0; i < 6; i++) {
            input[i] = scanner.nextLong();
            input[i] %= divisor;
        }
        scanner.close();

        long ABC = (input[0]*input[1]%divisor)*input[2]%divisor;
        long DEF = (input[3]*input[4]%divisor)*input[5]%divisor;

        long ans = (ABC-DEF+divisor)%divisor;

        System.out.println(ans);
    }
}