class CountCharacter{

    public static void main(String args[]){
        char ch = 'a';
        String str = "Automation";

        int count = 0;

        for(char c : str.toCharArray()){
            if(Character.toLowerCase(c) == ch){
                count++;
            }
        }

        System.out.println(count);
    }
}