package HW5;
import java.util.Arrays;
import java.util.Random;

public class HeapSort {
    
    public static void main(String[] args) 
    {
        int[] arr = new int[100000];
        Random random = new Random();
    
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = random.nextInt();
        }
        
        long startTime = System.nanoTime();
        heapSort(arr);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorting time: " + duration + " nanoseconds.");
    }
    
    public static void heapSort(int[] arr) 
    {
        buildMaxHeap(arr);
        for (int i = arr.length - 1; i > 0; i--) 
        {
            swap(arr, 0, i);
            maxHeapify(arr, 0, i);
        }
    }
    
    public static void buildMaxHeap(int[] arr) 
    {
        int lastNonLeafIndex = (arr.length - 2) / 2;
        for (int i = lastNonLeafIndex; i >= 0; i--) 
        {
            maxHeapify(arr, i, arr.length);
        }
    }
    
    public static void maxHeapify(int[] arr, int index, int heapSize)
    {
        int leftIndex = 2 * index + 1;
        int rightIndex = 2 * index + 2;
        int largestIndex = index;
        
        if (leftIndex < heapSize && arr[leftIndex] > arr[largestIndex]) 
        {
            largestIndex = leftIndex;
        }
        
        if (rightIndex < heapSize && arr[rightIndex] > arr[largestIndex]) 
        {
            largestIndex = rightIndex;
        }
        
        if (largestIndex != index) 
        {
            swap(arr, index, largestIndex);
            maxHeapify(arr, largestIndex, heapSize);
        }
    }
    
    public static void swap(int[] arr, int i, int j) 
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
