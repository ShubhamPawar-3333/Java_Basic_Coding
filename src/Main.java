public class Main {
    public static void main(String[] args) {

        /* Searching Input and outputs */

        BinarySearch ob = new BinarySearch();
        int[] arr = {2, 3, 4, 10, 40, 40};
        int result = ob.iterativeBinarySearch(arr, 40);
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



        /* Conversion input and outputs */
        Conversions obj2 = new Conversions();

        int result4 = obj2.deciToBin(20);
        System.out.println("Equivalent Binary: "+ result4);

        int result5 = obj2.binToDeci(100000);
        System.out.println("Equivalent Binary: "+result5);


    }
}