class GCD{
    public static void main(String args[]){

        // int gcd = 1;
         int num1 = 56;
         int num2 = 98;

        // for(int i = 1; i <= Math.min(num1, num2); i++){

        //     if(num1 % i == 0 && num2 % i == 0){
        //         gcd = i;
        //     }

        // }

        // System.out.println(gcd);

        int result = gcd(num1, num2);

        System.out.println("The GCD of: " + num1 + " & " + num2 + " is: " + result);
    }

    //Using optimal approach with Euclidean approach;
    public static int gcd(int num1, int num2){

        while(num2 != 0){

            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        return num1;
    }
}