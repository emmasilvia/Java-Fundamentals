public class OddsEven {
    public static void main(String[] args) {
            int[] array = new int[]{1, 7, 3, 10, 9};
            int odd = 0; int even = 0;

            for (int a = 0; a < array.length; a++) {
                if (array[a] % 2 != 0) {
                    odd++;
                } else {
                    even++;
                }
            }
            System.out.println("total nr of odds " + odd);
            System.out.print("total nr of evens " + even);


        }
    }








