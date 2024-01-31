package mvdspk.java.blind75;

public class PowXN {
    public int pow(int x, int n) {
        return n == 0 ? 1
                : n == 1 ? x
                        : (n % 2 == 0) ? pow(x, n / 2) * pow(x, n / 2)
                                : x * pow(x, n / 2) * pow(x, n / 2);
    }
}
