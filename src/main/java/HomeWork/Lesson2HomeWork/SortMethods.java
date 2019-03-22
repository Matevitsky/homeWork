package HomeWork.com.com.Lesson2HomeWork;

public class SortMethods {

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static int[] bubbleSort(int arr[]) {

        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }


    public static int[] selectionSort(int arr[]) {
        for (int left = 0; left < arr.length; left++) {
            int minInd = left;
            for (int i = left; i < arr.length; i++) {
                if (arr[i] < arr[minInd]) {
                    minInd = i;
                }
            }
            swap(arr, left, minInd);
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        for (int left = 0; left < arr.length; left++) {

            int value = arr[left];

            int i = left - 1;
            for (; i >= 0; i--) {

                if (value < arr[i]) {
                    arr[i + 1] = arr[i];
                } else {

                    break;
                }
            }

            arr[i + 1] = value;
        }
        return arr;
    }

    public static int[] quickSort(int arr[]) {
        return quickSort(arr, 0, arr.length - 1);
    }

    private static int[] quickSort(int arr[], int leftBorder, int rightBorder) {

        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = arr[(leftMarker + rightMarker) / 2];
        do {

            while (arr[leftMarker] < pivot) {
                leftMarker++;
            }

            while (arr[rightMarker] > pivot) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {

                if (leftMarker < rightMarker) {
                    int tmp = arr[leftMarker];
                    arr[leftMarker] = arr[rightMarker];
                    arr[rightMarker] = tmp;
                }

                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);


        if (leftMarker < rightBorder) {
            quickSort(arr, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(arr, leftBorder, rightMarker);
        }

        return arr;
    }


    public static int[] mergeSort(int[] arr) {
        int[] result = arr;
        if (arr.length < 2) return result;
        int mid = arr.length / 2;
        int left[] = new int[mid];
        int right[] = new int[arr.length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = 0; i < arr.length - mid; i++) {
            right[i] = arr[mid + i];
        }
        mergeSort(left);
        mergeSort(right);
        return merge(left, right, arr);

    }

    private static int[] merge(int[] a, int[] b, int[] all) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                all[k] = a[i];
                i++;
            } else {
                all[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length) {
            all[k++] = a[i++];
        }
        while (j < b.length) {
            all[k++] = b[j++];
        }
        return all;
    }

}