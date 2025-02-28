class binarySearch {
    public static void main(String args[])
    {
        int arr[]= {10, 15, 19, 25, 27 , 30};
        int x= 19, ind= -1, n= arr.length;
        int s= 0, e= n-1, mid;
        while(s<=e){
            mid= (s+e)/2;
            if(arr[mid] == x){
                ind= mid;
                System.out.println("Element found at index: "+ mid);
                break;
            }
            else if(arr[mid]<x){ // x is present at right
                s= mid+1;
            }
            else if( x < arr[mid]){ // x is present at left
                e= mid-1;
            }
        }
        if(ind==-1){
            System.out.println("Element not found at array");
        }
    }
}
