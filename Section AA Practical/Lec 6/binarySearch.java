class binarySearch {
    public static void main(String args[])
    {
        int arr[]= {10, 15, 19, 25, 27 , 30};
        int x= 109, ind= -1, n= arr.length;
        int s= 0, e= n-1, mid;
        while(s<=e){
            mid= (s+e)/2;
            if(arr[mid] == x){
                ind= mid;
                System.err.println("Element found at index "+ ind);
                break;
            }
            else if(arr[mid] < x){
                s= mid+1;
            }
            else if(x< arr[mid] ){
                e= mid-1;
            }
        }
        if(ind==-1){
            System.out.println("Element not found in the array ");
                
        }
    }
}
