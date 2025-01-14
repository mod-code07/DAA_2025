
class selectionSorting {
    //selection sort
    
    static void selectionSort(int arr[], int n){
        int i ,j, temp, min_ind;
        for(i=0;i<=n-2;i++){
            min_ind= i;
            for(j= i+1;j<=n-1;j++){
                if(arr[min_ind]>arr[j]){
                    min_ind= j;
                }
            }
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
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        selectSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}