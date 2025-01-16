
class bubbleSortingAndSelectionSoring {
    //bubble sort
    static void bubbleSort(int arr[], int n){
        for(int pass= 1;pass<= n-1; pass++){
            for(int j= 0;j<=n-1-pass;j++){
                if(arr[j]>arr[j+1]){
                    //swapping
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }
    static void selectionSort(int arr[], int n){
        int i, j, temp, min_ind;
        for(i=0;i<=n-2;i++){
            min_ind= i;
            for(j= i+1;j<=n-1;j++){
                if(arr[min_ind]>arr[j]){
                    min_ind= j;
                }
            }
            //swapping
            temp= arr[min_ind];
            arr[min_ind]= arr[i];
            arr[i]= temp;
        }
    }
    static void printArray(int arr[], int size){
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = { 4,5,3,2,1 };
        int n = arr.length;
        selectionSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}