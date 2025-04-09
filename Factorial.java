class Factorial{

    //Without recursion;


    // public static void main(String args[]){

    //     int number = 5;
        
    //     long factorial = calculateFactorial(number);

    //     System.out.println(factorial);
    // }

    // public static long calculateFactorial(int num){
        
    //     long result = 1;
        
    //     for(int i = 1; i <= num; i++){
    //         result *= i;
    //     }

    //     return result;
    // }


    //With recursion;
    
    public static void main(String args[]){
        int number = 5;
         
        long factorial = calculateFactorial(number);

        System.out.println("Fctorial of " + number +" is: "+ factorial);
    }

    public static long calculateFactorial(int num){

        //Base case if num is 0 or 1;
        if(num == 0 || num == 1){
            return 1;
        }
        else{
            return num * calculateFactorial(num - 1);
        }

    }
}