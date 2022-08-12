package Bai3;

public class RunMain {
    public static void main(String[] args) {
        if(checkPrime(2l)){
            System.out.println("La so nt");
        }else{
            System.out.println("Khong la so nguyen to");
        }

    }

    public static boolean checkPrime(int n){
        if(n<2) return false;
        for(int i = 2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }


    public static boolean checkPrime(long n){
        if(n<2) return false;
        for(int i = 2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static boolean checkPrime(float n){
        return false;
    }
    public static boolean checkPrime(double n){
        return false;
    }
}
