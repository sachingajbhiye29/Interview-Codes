class LargestElement{

    public static void main(String args[]){

        int arr[] = {1,2,49,29,23};
        int largest = arr[0];

        for(int num : arr){
            if(num > largest){
                largest = num;
            }
        }

        System.out.println("The largest element in the array is: " + largest);
    }
}