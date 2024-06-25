package modules.easyProblems.strings;

public class FibonacciSeriesTest {


    public static void printFibonacciSeries(int n) {

        if(n<=0) {

            System.out.println(" Value you entered is 0. Nothing to print.");
            return;
        }

        int prev=0;
        int curr =1;
        int temp =0;
        System.out.println("**********************************");
        System.out.println(" FibonacciSeries are as follows.... N= "+n);
        for (int i=1;i<=n;i++){

            System.out.println(prev);
            temp = prev +curr;
            prev = curr;
            curr =temp;

        }


    }

    public static void main(String[] args) {

        printFibonacciSeries(0);
        printFibonacciSeries(1);
        printFibonacciSeries(2);
        printFibonacciSeries(3);
        printFibonacciSeries(5);
        printFibonacciSeries(10);

    }



}
