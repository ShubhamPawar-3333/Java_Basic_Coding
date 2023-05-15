public class Sorting {

    public static void mergeSort(int[] arr, int si, int ei){
        if (si==ei){                    //If the starting index value equals ending index value the operation is ended
            return;                     // as only one element is left
        }
        int mid = si + ((ei - si)/2);   // Finding middle index to divide the array into two parts
        mergeSort(arr, si, mid);        // Function is recursively called for left half portion
        mergeSort(arr, mid+1, ei);   // Function is recursively called for right half portion
        merge(arr, si , mid, ei);       // Finally the merging of left and right sorted part is done
    }

    public static void merge(int[] arr, int si, int mid, int ei){
        int[] temp = new int[ei-si+1];  //A temporary Array is generated that can store all the values after sorting
        int i = si;                     // i tracks the elements of left part (from si to mid )
        int j = mid+1;                  // j tracks the elements of right part (from mid+1 to ei)
        int k = 0;                      // k indicates the index of temporary array (from 0 to temp.length-1)

        while (i<=mid && j<=ei){        //loop will go on till the value of i is between si and mid and value of j is
                                        //between mid+1 and ei....The AND operation is performed because if i attains
                                        //the value of mid or j attains the value of ei then it is not possible to do
                                        //comparison between elements of left and right part. SO both conditions should
                                        //be true to go on with loop.
            if (arr[i]<arr[j]){         // If element of left part is smaller than element of right
                temp[k] = arr[i];       // Assigning that value to temporary array
                i++;                    // Incrementing i for comparing next element of left with the previous element of right
            }else {                     // else
                temp[k] = arr[j];       // Assigning the value of right to the temporary array
                j++;                    // Incrementing j for comparing next element of right with previous element of left
            }
            k++;                        // K keeps on incrementing so that one by one elements are stored in temporary array
        }

        if(i > mid){                    // If the i reaches the value of mid there are no elements left to compare in left part
            while (j<=ei){              // So storing remaining elements of right part in remaining spaces of temporary array
                temp[k++] = arr[j++];
            }
        }else {                         // Else the there are no elements left to compare in right part
            while (i<=mid){             // So storing remaining elements of left part in remaining spaces of temporary array
                temp[k++] = arr[i++];
            }
        }

        for (k = 0, i = si; k<temp.length; k++,i++){
            arr[i]=temp[k];             // Finally all the elements of temporary array are again stored back in actual array
        }
    }
}
