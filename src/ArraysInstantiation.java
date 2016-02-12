
public class ArraysInstantiation {

    public static void main(String[] args) {
        /*syntax: .... = new <type>[<size>];*/
        //using numeric literal
        int []ages = new int[1];
        
        //using a variable
        int arraySize = 1;
        int []myAges = new int[arraySize];
        
        //using a expression
        int []itsAges = new int[3 / 2]; //size is 1
        
        //there may be 0 length arrays!
        int []zeroLengthArray = new int[0];
        System.out.print("array length is:");
        System.out.println(zeroLengthArray.length);
        
        //what happens if length is set to a negative number?
        int []negativeLengthArray = new int[-1];
    }
}
