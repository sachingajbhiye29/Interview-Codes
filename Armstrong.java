class Armstrong{

    public static void main(String args[]){
        int number = 153; 
        int originalNumber = number;  // Set originalNumber to number
        int remainder = 0; 
        int result = 0;  // Use int to hold the result of the sum of cubes

        // Calculate the sum of the cubes of each digit
        while (originalNumber != 0) {
            remainder = originalNumber % 10;  // Get the last digit
            result += remainder * remainder * remainder;  // Add the cube of the digit to result
            originalNumber /= 10;  // Remove the last digit
        }

        // Compare result with number as integers
        if (result == number) {
            System.out.println("Number is an Armstrong number" + result);
        } else {
            System.out.println("Number is not an Armstrong number" + result);
        }
    }
}