
/**
 * a wheel of 210 is constructed.ofc one can construct larger wheels for better efficiency but this alr gives sub second results.
 */
public class Problem_3
{
    static public void main(String[] args)
    {
        long n = 600851475143L;
        long prime = 1;
        long prime1 = 2;
        if (n % 2 == 0) {
            prime = 2;
        }
        if (prime != 2) {
            if (n % 3 == 0) {
                prime = 3;
            }
            if (n % 5 == 0) {
                prime = 5;
            }
        }
        int[] r = {1, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 209};
        long base = 0;
        while (base * base <= n) {
            int t = 0;
            while (t < r.length) {
                prime1 = base + r[t];
                if (prime1 * prime1 > n) {
                    break;
                }
                boolean f = true;
                long q = 11;
                while (q * q <= prime1) {
                    if (prime1 % q == 0) {
                        f = false;
                        break;
                    }
                    q = q + 2;
                }
                if (f && n % prime1 == 0) {
                    prime = prime1;
                }
                t = t + 1;
            }
            base = base + 210;
        }
        System.out.println(prime);
    }
}
