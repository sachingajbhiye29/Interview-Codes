class PascalTriangle{

    public static void main(String[] args) {
        
        int n = 5;
        generatePascalTriangle(n);

    }

    //Method to generate pascals trianle;
    public static void generatePascalTriangle(int num){

        int triangle [][] = new int [num][num];

        if(num == 0){
            System.out.println("No rows to display");
            return;
        }

        //Generate each row;
        for(int row = 0; row < num; row++){

            //intialize the row with appropriate value;
            //triangle[row] = new int[row+1];

            //first and last element should be 0;
            triangle[row][0] = 1;
            triangle[row][row] = 1;

            //fill in the intermediate value;
            for(int col = 1; col < row; col++){
                triangle[row][col] = triangle[row-1][col-1] + triangle[row-1][col];
            }
        }


        //printing the pascals triangle;
        printTraingle(triangle, num);

    }

    public static void printTraingle(int triangle[][], int num){

        //This print statements is only applicable with the jagged array; 
        // for(int[] row : triangle){
        //     for(int num : row){
        //         System.out.print(num + " ");
        //     }
        //     System.out.println();
        //}

        for(int row = 0; row < num; row++){
            for(int col = 0; col <= row; col++){
                System.out.print(triangle[row][col] + " ");
            }

            System.out.println();
        }

    }
}