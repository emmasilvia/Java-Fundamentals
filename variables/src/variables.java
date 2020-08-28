public class variables {
    public static void main (String[] args){
        int a, b;

        a = 15;
        b = 25;

        System.out.println("Ordinea variabilelor este " + a +"si" +b );

        int x = 0;
        x = a;
        a = b;
        b = x;

        System.out.println("Schimbarea ordinii variabilelor este " + a + "si" + b);



    }
}
