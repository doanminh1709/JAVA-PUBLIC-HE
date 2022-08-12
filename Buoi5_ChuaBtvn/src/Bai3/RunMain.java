package Bai3;

public class RunMain {
    public static void main(String[] args) {
        System.out.println(checkPrime(2));
        System.out.println(checkPrime(5L));
        System.out.println(checkPrime(7.2f));
        System.out.println(checkPrime(17.0d));

    }

    public static boolean checkPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


    public static boolean checkPrime(long n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean checkPrime(float n) {
        if (n == Math.ceil(n)) {
            if (n < 2) return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
        return false;
    }

    public static boolean checkPrime(double n) {
        if (n - (int) n == 0) {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
        return false;
    }
}
