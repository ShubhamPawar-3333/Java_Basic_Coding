public class Conversions {

    /* Program to convert Decimal number to Binary Number */
    public static int deciToBin(int n){

        //Logic
        /*
                n = 12 initializing bin = 0                         rem * pow (10, i) + bin = bin
                2  |  n = 12    rem = 0 : 12 / 2 = 6 (Quotient) ^   0 * pow(10,0) + 0 = 0
             ------|---------                                   |
                2  |  n = 6     rem = 0 : 6 / 2 = 3 (Quotient)  |   0 * pow(10,1) + 0 = 00
             ------|---------                                   |
                2  |  n = 3     rem = 1 : 3 / 2 = 1 (Quotient)  |   1 * pow(10,2) + 0 = 100
             ------|---------                                   |
                2  |  n = 1     rem = 1 : 1 / 2 = 0 (Quotient)  |   1 * pow(10,3) + 100 = 1100 (Output)
             ------|---------                                   |
                   |  n = 0 (Loop Stops)                        | collecting rem in reverse order
         */
        int rem, bin = 0;
//        int i = 1;
//        while (n!=0){                   // Loop will continue till n becomes zero
//            rem = n % 2;                // Dividing by 2 to get remainder
//            bin = bin  + (rem * i) ;    // To convert to binary multiply rem by power of 10 and add to previous bin
//            n = n / 2;                  // get the Quotient of the number
//            i*=10;                      //Increment i by factor of 10 so that to multiply rem by the obtained power
//        }                               // of 10

        // Another way of multiplying by power of 10 is to use Math.pow function instead of multiplying i by 10
        int j = 0;
        while (n!=0){
            rem = n % 2;
            bin = bin  + (rem * (int) Math.pow(10,j)) ;
            n = n / 2;
            j++;
        }
        return bin;
    }

    /* Program to convert Binary number to Decimal Number */

    //Logic
        /*
            Binary Number = 1100
            Iteration 1:
            initializing num = 0                    num + (Last Digit * pow (2,i)) = num for next iteration
            1100 % 10 = 0(Last Digit)    ==>         0   + ( 0 * pow (2,0) ) = 0
            1100 / 10 = 110 (Quotient)

            Iteration 2:
            110 % 10 = 0(Last Digit)     ==>         0   + ( 0 * pow (2,1) ) = 0
            110 / 10 = 11 (Quotient)

            Iteration 3:
            11 % 10 = 1(Last Digit)      ==>         0   + ( 1 * pow (2,2) ) = 4
            11 / 10 = 1 (Quotient)

            Iteration 4:
            1 % 10 = 1(Last Digit)       ==>         4   + ( 1 * pow (2,3) ) = 12 (Output)
            1 / 10 = 0 (Quotient)

         */
    public static int binToDeci(int n){
        int lastDigit, num = 0;
//        int i = 1;
//        while (n!=0){                     // Loop will continue till n becomes zero
//            lastDigit = n % 10;           // Dividing by 10 to get lastDigit
//            num = num + (lastDigit*i);    // To convert to Decimal multiply lastDigit by power of 2 and add to previous num
//            n = n / 10;                   // get the Quotient of the number
//            i*=2;                         //Increment i by factor of 2 so that to multiply lastDigit by the obtained power
//        }                                 // of 2

        // Another way of multiplying by power of 2 is to use Math.pow function instead of multiplying i by 2
        int j = 0;
        while (n!=0){
            lastDigit = n % 10;
            num = num + (lastDigit* (int) Math.pow(2,j));
            n = n / 10;
            j++;
        }
        return num;
    }
}
