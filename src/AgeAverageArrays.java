
import java.util.Arrays;

/**
 * - An array is a set of elements of the same type.
 * - Every element is access through an index.
 * - Arrays have 'length' property which is the number of elements it contains.
 * - Indexes start at 0 and end at length - 1.
 * - Arrays are objects.
 * - Arrays super class is Object.
 */
public class AgeAverageArrays {

    public static void main(String[] args) {
        int ages [] = {25, 29, 31}; //declares, instance and initialize the array
        int agesSum = 0;
        
        for (int i = 0; i < ages.length; i ++) { //sum all values in for loop
            agesSum += ages[i];
        }
        
        System.out.print("Age average for: ");
        System.out.print(Arrays.toString(ages)); //print the array using Arrays.toString method
        System.out.print(" is: ");
        System.out.println(agesSum / ages.length);//calculate average
    }
}
