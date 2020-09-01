public class ArrayEx7 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 7, 3, 10, 2, 9};
        int sum = 4;

        for( int a = 0; a < array.length; a++) {
            for (int b = a+1; b < array.length; b++) {
                if(array[a] + array[b] == sum)
                {
                    System.out.print(array[a]+ "-" + array[b]+ ";");
                }
            }
        }
    }
}

