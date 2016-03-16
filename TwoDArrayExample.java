import java.util.*; //needed for the Random number generator


/**
 * This is an example of a two-dimensional array in java.
 * In this example I have an array with three elements (rows)
 * Each row is another array of 4 elements (columns)
 * THis is a "rectangular" array because the numbers of columns
 * is the same for each row.
 * 
 * @author L. Lehmann
 * @version 4/2/2014
 * @author arionalmond
 * @version 3/14/16
 * 
 */
public class TwoDArrayExample
{
   public static void main(String[ ] args)
   {
       int [ ] [ ] numbers = new int[3][4]; //declare an array reference with three elements
                                            //each element (row) is an array of 4 elements (columns)
       Random rGen = new Random( ); //used to populate the elements of the arrays
       
       //To access each 'slot' or element in a two-dimensional array
       //you use two for loops which are nested, meand one of the for loops
       //is completely contained inside the outer for loop
       for(int row = 0; row < numbers.length; row++)
       {
           for(int col = 0; col < numbers[row].length; col++)
           {
               numbers[row][col] = rGen.nextInt(20);
            }
        }
        
        //now I will print each array, again using nested for loops
        for(int row = 0; row < numbers.length; row++)
       {
           for(int col = 0; col < numbers[row].length; col++)
           {
             System.out.print(numbers[row][col] + " ");
            }
            System.out.println( );
        }
    }//end of main( ) method
        
       
}
