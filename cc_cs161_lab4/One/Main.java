//HEADER
//Program Name: Activity One
//Author: Caelen Curtiss
//Class: CS161 Winter 2020
//Date: 01/30/2020
//Description: print numbers 1 - 10 using a for, while, and do-while loop

class Main{
    public static void main(String[] args){
        //Runs loop methods for, while, and do..while
        printFor();
        //Seperates loops in console
        System.out.println("");
        printWhile();
        //Seperates loops in console
        System.out.println("");
        printDo();
    }

    //For loop method
    private static void printFor(){
        //Print title head for the series
        System.out.print("For: ");
        for(int forInt = 1; forInt <= 10; forInt = forInt + 1){
            //Print each integer in the series
            System.out.print(forInt + " ");
        }
    }

    //While loop method
    private static void printWhile(){
        //Print title head for the series  
        System.out.print("While: ");
        //initialize local variable
        int whileInt = 1;
        while(whileInt <= 10){
            //Print each integer in the series
            System.out.print(whileInt + " ");
            //Credit to Javi for showing me a more efficient increment method (++i / i++)
            whileInt++;
        }
    }

    //Do..While loop method
    private static void printDo(){
        System.out.print("do...while: ");
        int doInt = 0;
        do{
            doInt++;
            System.out.print(doInt + " ");
        }
        while(doInt <= 9);

    }    
    
}
/* FOOTER
For: 1 2 3 4 5 6 7 8 9 10
While: 1 2 3 4 5 6 7 8 9 10
do...while: 1 2 3 4 5 6 7 8 9 10
*/
