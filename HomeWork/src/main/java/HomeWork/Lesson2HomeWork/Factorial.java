package HomeWork.Lesson2HomeWork;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {
    private static Random rand = new Random();

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        long start = System.currentTimeMillis();
        factorial(n);
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println("Factorial time "+timeConsumedMillis);

        start = System.currentTimeMillis();
        System.out.println( IntStream.rangeClosed(1, n)
                .parallel()
                .mapToObj(String::valueOf)
                .map(BigInteger::new)
                .reduce((a, b) -> a.multiply(b))
                .get());

        finish = System.currentTimeMillis();
        timeConsumedMillis = finish - start;
        System.out.println("Miltithred Factorial time:  "+timeConsumedMillis);

    }

    public static BigInteger factorial(int n) {
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        System.out.println(res.toString());
        return res;
    }

}
