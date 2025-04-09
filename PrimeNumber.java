class PrimeNumber{

    public static void main(String args[]){

        
        if(isPrime(2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

    public static boolean isPrime(int num){
        //Brute force Method;
        if(num <= 1){
            return false;
        }

        //check from 2 to n-1;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

   // In this method, the check is done from 2 to n/2 as a number 
   //is not divisible by more than half its value.

//    public static boolean isPrime(int num){
    
//         if(n <= 1){
//             return false;
//         }
//         for(int i = 2; i <= num; i++){
//             if(num % i == 0){
//                 return false;
//             }
//         }

//         return true;
//    }
}