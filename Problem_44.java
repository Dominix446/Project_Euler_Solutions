/*
1) Pentagonal numbers: P_n = n(3n-1)/2.
2) Let k = n + c (c > 0). Then
   P_{n+c} - P_n = ((n+c)(3(n+c)-1) - n(3n-1))/2
                 = (6*n*c + 3*c^2 - c)/2.
   So the difference equals (6nc + 3c^2 - c)/2.
3) For a number X to be pentagonal there must exist m with X = m(3m-1)/2.
   Equivalently (sqrt(24X+1) + 1)/6 must be an integer.
4) The task becomes trivial: find positive integers n,c such that both
   P_{n+c} + P_n and P_{n+c} - P_n are pentagonal, and minimize
   D = P_{n+c} - P_n = (6nc + 3c^2 - c)/2.

*/
public class ProjectEuler44 {
    public static void main(String[] args) {
        final int MAXN = 10000; //arbitrary search limit
        long bestD = Long.MAX_VALUE;
        int bestN = -1, bestK = -1;
        for (int n = 1; n <= MAXN; n++) {
            long pn = (long)n * (3L * n - 1L) / 2L;
            for (int c = 1; n + c <= MAXN; c++) {
                int k = n + c;
                long pk = (long)k * (3L * k - 1L) / 2L;
                long diff = pk - pn;
                if (diff <= 0) continue;
                if (diff >= bestD) break; 

                long sum = pk + pn;
                long s1 = 24L * diff + 1L;
                long r1 = (long)Math.sqrt(s1);
                if (r1 * r1 != s1) continue;
                if ((r1 + 1L) % 6L != 0L) continue;
                long s2 = 24L * sum + 1L;
                long r2 = (long)Math.sqrt(s2);
                if (r2 * r2 != s2) continue;
                if ((r2 + 1L) % 6L != 0L) continue;
                if (diff < bestD) {
                    bestD = diff;
                    bestN = n;
                    bestK = k;
                }
            }
        }
         long pn = (long)bestN * (3L * bestN - 1L) / 2L;
         long pk = (long)bestK * (3L * bestK - 1L) / 2L;
         System.out.print(pk+"   "+pn+ "   "+(pk-pn));
    }
}
