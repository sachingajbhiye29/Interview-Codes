class SwapTwoNumbers{
    public static void main(String args[]){
        int num1 = 10;
        int num2 = 20;

        swap(num1, num2);
    }

    public static void swap(int a, int b){
        int num1 = a;
        int num2 = b;
        num1 = num1 ^ num2;
        num2 = num2 ^ num1;
        num1 = num1 ^ num2;
        System.out.println(num1 +" "+ num2);
    }
}