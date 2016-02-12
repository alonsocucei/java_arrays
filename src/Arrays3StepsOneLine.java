
import java.util.Arrays;


public class Arrays3StepsOneLine {

    public static void main(String[] args) {
        //Short syntax (used just for declarations):
        int []ages = {25, 27, 29};

        //Long syntax (used when passing arguments to a method):
//        int []ages = new int[]{31, 33, 35};
        System.out.println(Arrays.toString(ages));
        
        
//        sortArray({39, 24, 35});//syntax not allowed
//        System.out.println(Arrays.toString(sortArray({39, 24, 35}))); 

//        sortArray(new int[]{39, 24, 35});
//        System.out.println(Arrays.toString(sortArray(new int[]{39, 24, 35})));
    }
    
    public static int[] sortArray(int[] array) {
        Arrays.sort(array);
        
        return array;
    }
}
