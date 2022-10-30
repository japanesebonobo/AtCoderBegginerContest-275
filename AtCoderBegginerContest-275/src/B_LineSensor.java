package src;
import java.math.BigInteger;
import java.util.*;

public class B_LineSensor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();
        long D = scanner.nextLong();
        long E = scanner.nextLong();
        long F = scanner.nextLong();

        String a = String.valueOf(A);
        String b = String.valueOf(B);
        String c = String.valueOf(C);
        String d = String.valueOf(D);
        String e = String.valueOf(E);
        String f = String.valueOf(F);

        BigInteger aBig = new BigInteger(a);
        BigInteger bBig = new BigInteger(b);
        BigInteger cBig = new BigInteger(c);
        BigInteger dBig = new BigInteger(d);
        BigInteger eBig = new BigInteger(e);
        BigInteger fBig = new BigInteger(f);

        BigInteger one = aBig.multiply(bBig).multiply(cBig);
        BigInteger two = dBig.multiply(eBig).multiply(fBig);

        BigInteger ansBig = one.subtract(two);
        BigInteger num = new BigInteger("998244353");
        String ans = ansBig.remainder(num).toString();

        System.out.println(ans);
    }
}

