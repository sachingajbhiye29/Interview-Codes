import java.util.Arrays;

class Anagram{

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        String str1 = "liste";
        String str2 = "silent";

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1, arr2));

    
    }
}