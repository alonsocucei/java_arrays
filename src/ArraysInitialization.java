
import java.util.Arrays;


public class ArraysInitialization {

    public static void main(String[] args) {
        int []ages = new int[2];
        System.out.println(Arrays.toString(ages));

        //initialize every index
//        ages[0] = 29;
//        ages[1] = 30;
//        System.out.println(Arrays.toString(ages));
        
        //watch out!! valid indexes are from 0 to length - 1
//        ages[2] = 31;
//        System.out.println(Arrays.toString(ages));
        
        //initialize using for statement
//        for (int i = 0; i < ages.length; i ++) {
//            ages[i] = 28;
//        }
//        
//        System.out.println(Arrays.toString(ages));

        //initialize using fill method
//        Arrays.fill(ages, 20);
//        System.out.println(Arrays.toString(ages));
    }
}
