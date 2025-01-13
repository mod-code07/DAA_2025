
class bubbleSorting {
    //bubble sort
    static void bubbleSort(int arr[], int n){
        int pass, j, temp;
        for(pass= 1; pass<=n-1; pass++){
            for(j= 0; j<= n-1-pass; j++){
                if(arr[j]>arr[j+1]){
                    // swapping
                    temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }
    
    static void printArray(int arr[], int size){
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}