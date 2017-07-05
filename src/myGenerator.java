import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by said on 05/07/17.
 */
public class myGenerator {
    public static void main(String[] args) {
        int radix = 10;
        Random random = new SecureRandom();
        do {
            BigInteger bi = new BigInteger(100, random);
            System.out.println(bi.toString(radix));
        }while (true);
    }
}
