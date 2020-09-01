public class ArrayEx1 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 7, 3, 10, 9};

        int a = 0;
        int sumNumbers = 0;
        for (;a < numbers.length; a++)


            sumNumbers = sumNumbers + numbers[a];
//int sau double?
        int average = sumNumbers / numbers.length;

        System.out.println("The average value of array numbers is " + average + ".");
    }
}


