import java.util.HashSet;

class RemoveDuplicates{

    public static void main(String[] args) {
        
        int arr[] = {40,29,40,29,33,49};

        HashSet set = new HashSet<>();

        for(int i : arr){
            set.add(i);
        }

        System.out.println(set);
    }
}