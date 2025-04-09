class Palindrome{

    public static void main(String args[]){

        String str = "saippuakivikauppias";
        int num = 121;

        //System.out.println(checkPalindromString(str));

        System.out.println(checkPalindromNumber(num));
    }

    //Method to check if a strinclis palindrome;
    public static boolean checkPalindromString(String str){

        String revStr = "";
        for(int i = str.length() - 1; i>=0; i--){
            revStr = revStr + str.charAt(i);
        }

        if(str.toLowerCase().equals(revStr.toLowerCase())){
            return true;
        }

        return false;

    }

    //method to check if a number is palindrome;
     public static boolean checkPalindromNumber(int num){

         int revNum= 0;
         int oriNum = num;

         while(num != 0){
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num = num / 10;
         }

         if(revNum == oriNum){
            return true;
         }

         return false;
         
     }
}