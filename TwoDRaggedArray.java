import java.util.*;
import java.text.*;
/**
 * This is an example of a two-dimensional array in Java.
 * This array is ragged, eaning that every "row" does not have
 * the same number of columns. A two dimensional array is simply
 * an array, where each row is another array.
 * 
 * All the elements in the array must be of the same data type.
 * 
 * In this example I am storing salaries for workers at each of my
 * store locations. I own three stores. Each store has a different number of
 * workers.
 * 
 * @author L. Lehmann
 * @version 4/2/2014
 * @author arionalmond
 * @version 3/14/16
 * 
 */
public class TwoDRaggedArray
{
   public static void main(String [ ] args)
   {
       final int NUM_STORES = 3; //I made this a constant so it can easily be changed if my business grows
       Random rGen = new Random( );//I will use this to genrate pay rates
       DecimalFormat df = new DecimalFormat("$#.00");//I will use this to make the money putput look nice
       
       //In the following  line I am creating a two-d array.
       //The number of rows is 3 and each row is another array. But I did not yet
       //specify how many elements are in each row
       double [ ] [ ]salaries = new double[NUM_STORES][ ];
       
       //In the following three line I create the array for each row
       salaries[0] =  new double[5];//my first store has 5 workers
       salaries[1] = new double [4] ;//my second store has 4 workers
       salaries[2] = new double[6]; //my third store has 6 workers
       
       //populate each array with random payrates- 
       //Because in Java an array is an Object with a length field, I can have
       //my nested loops go through each row and then each column even though
       //the number of columns for each row have different values
       for(int store = 0; store < salaries.length; store++)
       {
           //go through each column for each row, one row at a time
           for(int empl = 0; empl < salaries[store].length; empl++)
           {
               //generate a random payrate for each employee
               salaries[store][empl] = (rGen.nextDouble( ) + rGen.nextInt(5) + 1)* 4.0;
            }
            
        }
        
        //In this nested for loop code I simply print the conents of the two-dimensional array
        for(int store = 0; store < salaries.length; store++)
       {
           System.out.print("Store number " + (store + 1) + ":\t");
           for(int empl = 0; empl < salaries[store].length; empl++)
           {
               System.out.print(df.format(salaries[store][empl] ) + "\t");
            }
            System.out.println( );//print a new line after the data for one store is printed
       }
    } //end of main( )
}

