import java.util.*;

public class heapSort {
    
    private static void heapPropertyAtNode(int[] v, int ind, int n) {
        int l = 2 * ind + 1, r = 2 * ind + 2, large = ind;
        
        if (l < n && v[large] < v[l]) large = l;
        if (r < n && v[large] < v[r]) large = r;
        
        if (large != ind) {
            int temp = v[large];
            v[large] = v[ind];
            v[ind] = temp;
            heapPropertyAtNode(v, large, n);
        }
    }
    
    private static void sortArr(int[] v) {
        int n = v.length, size = n;
        
        for (int i = n / 2; i >= 0; i--) 
            heapPropertyAtNode(v, i, n);
        // max heap
        while (size-- > 0) {
            int temp = v[0];
            v[0] = v[size];
            v[size] = temp;
            heapPropertyAtNode(v, 0, size);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        sortArr(arr);
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}