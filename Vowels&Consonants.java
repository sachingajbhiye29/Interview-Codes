class VowelsandConsonants {

    public static void main(String args[]){

        String str = "awesome";
        int vowels = 0;
        int consonants = 0;

        for(char c : str.toCharArray()){
            if("aeiouAEIOU".indexOf(c) != -1){
                vowels++;
            }
            else if(Character.isLetter(c)){
                consonants++;
            }
        }

        System.out.println("Number of vowels are: " +vowels+ "  and number of consonants are "+ consonants);

    }
}