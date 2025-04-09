class SmallestElement{

    public static void main(String args[]){

        int arr[] = {49,39,24,34,48,59};
        int smallest = arr[0];

        for(int i : arr){
            if(i<smallest){
                smallest = i;
            }
        }

        System.out.println("The smallest number in an array is : " + smallest);
    }
}