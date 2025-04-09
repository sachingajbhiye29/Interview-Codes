class CountNumbers{

    public static void main(String[] args) {
        
        int num = 29392;

        int count = 0;

        if(num == 0){
            count = 1;
        }

        while(num != 0){
            num = num/10;
            count++;
        }

        System.out.println("The count of digits in a number is : " + count);
    }
}