package JavaMistakes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Mistakes {
    public static void main(String[] args) {
        concurrentModificationExceptin();
    }

    private static void concurrentModificationExceptin() {
        List<String> words = new ArrayList<>(
                Arrays.asList("a", "b", "c", "0")
        );

       words.removeIf(w -> w.equals("a"));
    }

    public static void generics() {
        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(10);
        listOfNumbers.forEach(
                n -> System.out.println(n * 2)
        );
    }

    public boolean ifs(){
        boolean a = "a".equals("A");
        return a;
    }

    private String tenary(int age){
        return age >=18 ? "Adult" : "Child";
    }


}
