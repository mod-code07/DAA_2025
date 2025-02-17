class linearSearch {
    public static void main(String args[])
    {
        int arr[]= {10, 2, 11, 100, 20 , 5};
        int n= arr.length, i, ind= -1, x= 100;
        for(i=0;i<n;i++){
            if(arr[i] == x){
                ind= i;
                System.out.println("Element found at index "+i);
                break;
            }
        }
        if(ind==-1){
            System.out.println("Element not found in the array ");
                
        }
    }
}
