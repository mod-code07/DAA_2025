
class selectionSorting {
    
    static void selectSort(int arr[], int n){
        int pass, j, temp;
        for(pass= 1; pass<=n-1; pass++){
            int min_ind= pass-1;
            for(j= pass; j<= n-1; j++){
                if(arr[min_ind]>arr[j]){
                    // swapping
                    temp= arr[min_ind];
                    arr[min_ind]= arr[j];
                    arr[j]= temp;
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
        selectSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}