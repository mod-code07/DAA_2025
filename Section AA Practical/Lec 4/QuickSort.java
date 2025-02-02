public class QuickSort {

    // Method to partition the array using the first element as pivot
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; 
        int left = low + 1;
        int right = high;

        while (left <= right) {
            if (arr[left] <= pivot) {
                left++;
            } else {
                // Swap elements
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            }
        }

        // Place pivot at its correct position
        arr[low] = arr[right];
        arr[right] = pivot;

        return right;
    }

    // QuickSort recursive method
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            // Recursively sort elements before and after the partition
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};

        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        quickSort(array, 0, array.length - 1);

        System.out.println("\nSorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
