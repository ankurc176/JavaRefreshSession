package Program;

public class PrimeNumber {

    public static void main(String[] args) {

        int n=50;
        for (int j=1;j<=n;j++) {
            if (isPrime(j)){
                System.out.println(j+" ");
            }
        }
    }
    static boolean isPrime(int num) {

        if (num == 0 || num ==1)
            return false;

        for (int i=2;i<num;i++) {
            if(num%i==0) {
               return false;
            }
        }
        return true;
    }

}
