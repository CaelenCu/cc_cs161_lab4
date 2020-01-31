//HEADER
//Program Name: Activity Two
//Author: Caelen Curtiss
//Class: CS161 Winter 2020
//Date: 01/30/2020
//Description: print numbers 1 - 10, skipping 4 and 7

class Main{
    public static void main(String[] args){
        //Run command to print operation
        printNum();
    }

    //Print numbers 1 through 10 skipping 4 and 7
    private static void printNum(){
        int i = 1;
        while(i <= 10){
            if(i == 4 || i == 7){
                //increment to prevent infinite loop
                ++i;
                //iterates witout printing to console
                continue;
                
            }
            else{
                //prints appropriate numbers in the series
                System.out.print(i + " ");
                //increment by one
                i++;
            }
        }
    }
}
/* FOOTER
1 2 3 5 6 8 9 10
*/