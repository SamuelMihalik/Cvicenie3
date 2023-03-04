package fei.stuba.uim.oop;

public class Quicksort {

    static void intSwap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void stringSwap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int intPartitionAsc(int arr[], int low, int high) {

        int pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                intSwap(arr, i, j);
            }
        }
        intSwap(arr, i + 1, high);

        return(i + 1);
    }

    static int intPartitionDesc(int arr[], int low, int high) {

        int pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] >= pivot) {
                i++;
                intSwap(arr, low, high);
            }
        }

        intSwap(arr, low+1, high);

        return(i + 1);
    }

    static void intQuickSortAsc(int arr[], int low, int high) {
        if (low < high) {
            int pivotIndex = intPartitionAsc(arr, low, high);

            intQuickSortAsc(arr, low, pivotIndex - 1 );
            intQuickSortAsc(arr, pivotIndex + 1, high);
        }
    }

    static void intQuickSortDesc(int arr[], int low, int high) {
        if (low < high) {
            int pi = intPartitionDesc(arr, low, high);

            intQuickSortDesc(arr, low, pi - 1 );
            intQuickSortDesc(arr, pi + 1, high);
        }
    }

    static int stringPartitionAsc(String arr[], int low, int high) {

        String pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                stringSwap(arr, i, j);
            }
        }
        stringSwap(arr, i + 1, high);

        return(i + 1);
    }

    static int stringPartitionDesc(String arr[], int low, int high) {

        String pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) > 0) {
                i++;
                stringSwap(arr, i, j);
            }
        }
        stringSwap(arr, i + 1, high);

        return(i + 1);
    }

    static void stringQuickSortAsc(String arr[], int low, int high) {
        if (low < high) {
            int pivotIndex = stringPartitionAsc(arr, low, high);

            stringQuickSortAsc(arr, low, pivotIndex - 1 );
            stringQuickSortAsc(arr, pivotIndex + 1, high);
        }
    }

    static void stringQuickSortDesc(String arr[], int low, int high) {
        if (low < high) {
            int pivotIndex = stringPartitionDesc(arr, low, high);

            stringQuickSortDesc(arr, low, pivotIndex - 1 );
            stringQuickSortDesc(arr, pivotIndex + 1, high);
        }
    }

}