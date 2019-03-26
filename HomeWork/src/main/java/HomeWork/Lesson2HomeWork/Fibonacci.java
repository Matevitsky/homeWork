package HomeWork.Lesson2HomeWork;

public class Fibonacci {

    public static int fibonacci(int number) {
        int first = 1;
        int second = 1;
        int sum = 0;

        int j = 2;
        while (j <= number) {
            sum = first + second;
            first = second;
            second = sum;
            j++;
        }

        return first;
    }


    public static int fibonacciRecursion(int n) {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else{
            return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
        }
    }


}
