
class bubbleSortingAndSelectionSoring {
    //optimised bubble sort
    static void bubbleSort(int arr[], int n){
        for(int pass=1; pass<=n-1; pass++){
            boolean swap= false;
            for(int j= 0; j<= n-1-pass; j++){
                if(arr[j]>arr[j+1]){
                    //swapping
                    swap= true;
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
            if(swap==false) break;
        }
    }

    static void selectionSort(int arr[], int n){
        int i, j, min_ind, temp;
        for(i=0;i<=n-2;i++){
            min_ind= i;
            for(j= i+1; j<=n-1;j++){
                if(arr[min_ind]>arr[j]){
                    min_ind= j;
                }
            }
            temp= arr[min_ind];
            arr[min_ind]= arr[i];
            arr[i]= temp;
        }
    }
    static void insertionsort(int arr[], int n)
    {
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String args[]){
        int arr[] = { 4,5,3,2,1 };
        int n = arr.length;
        insertionsort(arr, n);
        System.out.println("Sorted array: ");
        int i;
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " "); 
    }
}