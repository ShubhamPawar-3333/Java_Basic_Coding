public class Main {
    public static void main(String[] args) {

        BinarySearch ob = new BinarySearch();
        int[] arr = {2, 3, 4, 10, 40};
        int result = ob.iterativeBinarySearch(arr, 3);
        if (result==-1){
            System.out.println("Target Element not found");
        }else {
            System.out.println("The target element is at index: "+result);
        }

        int result2 = ob.recursiveBinarySearch(arr, 0, arr.length-1, 3);
        if (result2==-1){
            System.out.println("Target Element not found");
        }else {
            System.out.println("The target element is at index: "+result2);
        }

        int result3 = ob.collectionBinarySearch(arr, 0);
        if (result3==-1){
            System.out.println("Target Element not found");
        }else {
            System.out.println("The target element is at index: "+result3);
        }

    }
}