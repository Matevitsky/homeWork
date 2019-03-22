package HomeWork.com.com.Lesson2HomeWork;

public class Main {
   // private static Random rand = new Random();

    public static void main(String[] args) {

        System.out.println(Fibonacci.fibonacci(7));
        System.out.println(Fibonacci.fibonacciRecursion(7));

        int bigArr[] = new int[1];
        int temp[] = new int[1];

        for (int i = 0; i < bigArr.length; i++) {
            bigArr[i] = bigArr.length - i;
        }

        System.arraycopy(bigArr,0,temp,0,bigArr.length);
        long start = System.currentTimeMillis();
        SortMethods.quickSort(temp);
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println("Quick sort Time: "+timeConsumedMillis);


        System.arraycopy(bigArr,0,temp,0,bigArr.length);
        start = System.currentTimeMillis();
        SortMethods.mergeSort(bigArr);
        finish = System.currentTimeMillis();
        timeConsumedMillis = finish - start;
        System.out.println("Merge Sort time: "+timeConsumedMillis);

        System.arraycopy(bigArr,0,temp,0,bigArr.length);
        start = System.currentTimeMillis();
        SortMethods.bubbleSort(bigArr);
        finish = System.currentTimeMillis();
        timeConsumedMillis = finish - start;
        System.out.println("Bubble sort time: "+timeConsumedMillis);

        System.arraycopy(bigArr,0,temp,0,bigArr.length);
        start = System.currentTimeMillis();
        SortMethods.insertionSort(bigArr);
        finish = System.currentTimeMillis();
        timeConsumedMillis = finish - start;
        System.out.println("Insertion sort time: "+timeConsumedMillis);

        System.arraycopy(bigArr,0,temp,0,bigArr.length);
        start = System.currentTimeMillis();
        SortMethods.selectionSort(bigArr);
        finish = System.currentTimeMillis();
        timeConsumedMillis = finish - start;
        System.out.println("Selection sort time: "+timeConsumedMillis);



    }
}
