//HEADER
//Program Name: Activity Three
//Author: Caelen Curtiss
//Class: CS161 Winter 2020
//Date: 01/30/2020
//Description: print the sum of numbers 1 through 10

class Main{
    public static void main(String[] args){
        //Run mthod to print the sum of 1 through 10
        numSum();
    }

    private static void numSum(){
        //While loop method
        System.out.print("Result: ");
        //initialize local variables for loop
        int whileInt = 1;
        int sum = 0;
        while(whileInt <= 10){
            //add the current number to a running total of the sum
            sum = sum + whileInt;
            //increment variable
            ++whileInt;
        }
        //Prints the sum to console as requested
        System.out.println(sum);
    }
}
/* FOOTER
Result: 55
*/