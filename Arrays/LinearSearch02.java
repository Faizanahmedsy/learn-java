public class LinearSearch02 {

    public static int linearSearch(String names[], String key) {

        for(int i = 0; i<names.length; i++){
            if (names[i] == key){
                return i;
            }

        }

        return -1;
    }

 public static void main(String[] args) {

    String names[] = {"Faizan", "Aaftab", "Aaqib", "Saad", "Rizwan", "Shaby", "Nitesh", "Jil" };

    String key = "Faizan";

    int result = linearSearch(names, key);

    if(result == -1){
        System.out.println("Not found");
    } else {
        System.out.println("Found at " + result);
    }



    
 }
}
