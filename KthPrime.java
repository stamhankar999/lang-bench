public class KthPrime {
    private static boolean isPrime(int n) {
        for (int i=2; i<n/2; i++) {
          if (n%i == 0)
            return false;
        }
        return true;
    }

    private static int kthPrime(int k) {
        int candidate = 2;
        while (k > 0) {
          if (isPrime(candidate))
            k--;
          candidate++;
        }
        return candidate-1;
    }

    public static void main(String[] args) {
        System.out.println(kthPrime(10000));
    }
}
