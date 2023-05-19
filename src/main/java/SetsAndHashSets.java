import java.util.*;

public class SetsAndHashSets {
    public static void main(String[] args) {

        //Set<String> names = new HashSet<>();
        Set<String> names = new TreeSet<>(); //Hashset is fast, treeSet is OK for ordering
        //there is also LinkedHashSet - this one maintains insertion order
        //real world we will use HashSet

        /**
         *  whenever you don't want duplicates but don't care about the order, e.g removing duplicates elements from a list
         */


        names.add("Walter");
        names.add("Jessie");
        names.add("Skyler");
        names.add("Mike");
        names.add("Saul");
        names.add("Walter");
        names.add("Walter");

        names.remove("Walter"); //you cannot use an index to remove an element from the set
        //names.clear();

        System.out.println(names); //unlike a list, a hashset has no particular order
        //walter is added once, no duplicates allowed
        //System.out.println(names.size());
        //System.out.println(names.contains("Saul"));
        //System.out.println(names.isEmpty());

       //names.forEach(System.out::println);
       Iterator<String> namesIterator = names.iterator();
       while(namesIterator.hasNext()){
           System.out.println(namesIterator.next());
       }

       List<Integer> numberList = new ArrayList<>();
       numberList.add(1);
       numberList.add(2);
       numberList.add(3);
       numberList.add(4);
       numberList.add(2);
       numberList.add(3);
       System.out.println(numberList);

       Set<Integer> numberSet = new HashSet<>(numberList);
       //numberSet.addAll(numberList);
       System.out.println(numberSet);


    }
}
