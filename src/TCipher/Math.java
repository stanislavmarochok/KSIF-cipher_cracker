package TCipher;


public class Math {

    public static boolean isPrime(int input) {
        if (input % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= input; i += 2) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int factorial(int n) {
        int retVal = 1;
        for (int i = 2; i <= n; i++) {
            retVal *= i;
        }
        return retVal;
    }
}