public class ArrayEx2 {
    public static void main(String[] args) {
        int[] arrayInt = new int[]{1, 7, 3, 10, 9};

        System.out.println("The odds numbers in array are: " );
        for (int a = 0; a < arrayInt.length; a++) {

            if (arrayInt[a] % 2 != 0) {

                System.out.print(a);
            }
        }
    }
}
