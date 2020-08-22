public class ArrayEx5 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 7, 3, 7, 10, 1, 9};


        for (int a = 0; a < array.length; a++)
        {

            for (int b= a+1; b < array.length; b++)
            {

                if (array[a] == array[b])
                {

                    System.out.println(array[b]);
                }
                }


        }
    }
}