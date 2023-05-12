import java.util.Arrays;

public class BinarySearch {

    //Program for Binary Search in an array with Iterative way.
    public static int iterativeBinarySearch(int[] arr, int target){
        int start = 0;                  // Initializing start index of array
        int end  = arr.length-1;        // Initializing end index of array
        while (start<=end){             // Code will run till the start index is less or equal to end index
            int mid = (start+end)/2;    // Finding middle index of the array
            if (arr[mid]==target){
                return mid;             // Returning index if element is present at mid index
            }
            if (arr[mid]<target){
                start = mid+1;          //If mid element is less than target then element is present in right part
            }else {
                end = mid-1;            //Else element is in left part
            }
        }
        return -1;                      //If index is not found returning -1
    }

    //Program for Binary Search in an array with Recursive way.

    //The recursive way needs 4 arguments as input array, starting index, ending index and target element
    public static int recursiveBinarySearch(int[] arr, int start, int end, int target){
        if (start <= end){
            int mid = (start+end)/2;        // Finding middle index of the array
            if (arr[mid]==target) {
                return mid;                 // Returning index if element is present at mid index
            }
            /* If target element is greater than the middle element then again calling the function by considering
            right part of the array else calling the function by considering left part.
             */
            if (target>arr[mid]){
                return recursiveBinarySearch(arr, mid+1, end, target);
            }else {
                return recursiveBinarySearch(arr, start, mid-1, target);
            }
        }
        return -1;      //If index is not found returning -1
    }

    // Efficient way of Binary Search using Arrays Class of java.
    public static int collectionBinarySearch(int[] arr, int target){
        return Arrays.binarySearch(arr,target);
    }
}
