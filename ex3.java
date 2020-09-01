public class ex3 {
        public static void main(String[] args) {
            int year = 1801;
            boolean leap = false;
            if (year%4 == 0 || year % 100 != 0)
                {
                    if (year % 400 == 0)
                        leap = true;
                    else leap = false;
                }

            if(leap){
                System.out.println(year+ " is leap");
            }
            else System.out.println(year+ " is not leap year");
        }

}
