import java.util.Arrays;

public class ReverseArray {
//    public static void main(String[] args) {
//        int[] array = {1, 7, 3, 10, 9};
//        for (int i = array.length - 1; i >= 0; --i)
//        {
//            System.out.println(array[i]);
//        }
//    }
//}

       public static void main(String[] args) {

           int[] array = {1, 7, 3, 10, 9};
           int reversed = array.length - 1;
           int[] reverseArray = new int[array.length];

           for(int a = 0; a < array.length; a++) {
               reverseArray[reversed] = array[a];
               reversed--;}

               System.out.println("Array is: " + Arrays.toString(array));
               System.out.println("Array as reversed: " + Arrays.toString(reverseArray));


       }
}

