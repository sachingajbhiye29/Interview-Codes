class CheckLeapYear{

    public static void main(String args[]){

        int year = 1990;

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println(isLeap);

    }
}