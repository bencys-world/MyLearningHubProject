package modules.easyProblems.numbers;

public class CheckPrimeNumberTest {

    public static boolean isPrime(int n) {

        boolean isFactor = false;

        for (int i=2;i< n/2;i++){
            if(n % i ==0) {
                isFactor = true;
                break;
            }
        }

        return   !isFactor;



    }

    public static void main(String[] args) {

        System.out.println(" Is 100 a prime ? "+isPrime(100));

        System.out.println(" Is 7 a prime ? "+isPrime(7));

        System.out.println(" Is 71 a prime ? "+isPrime(71));

        System.out.println(" Is 5 a prime ? "+isPrime(5));
        System.out.println(" Is 9 a prime ? "+isPrime(9));
        System.out.println(" Is 13 a prime ? "+isPrime(13));

    }
}
